package com.proxy.mysql;

import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DataSourcePool implements DataSource {
	
	
	// ��ʼ�������� ʮ�� ���ӷ������ӳ�
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.106.11:3306/hive";
	private static String user = "hiveowner";
	private static String password = "Password_1";
	
	// ����һ������������ 10�� ����
	private static LinkedList<Connection> dataSource = new LinkedList<Connection>();
	
	// ��̬����飬ִֻ��һ��
	static {
		try {
			// ע������
			Class.forName(driver);
			// ����ʮ������
			for (int i = 0; i < 10; i++) {
				dataSource.add(DriverManager.getConnection(url, user, password));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
/*		// ��ʾ�����ӳ��л�ȡ���Ӷ���
		if (dataSource.size() > 0) {
			// ���ﷵ�ص������������Ķ���(ʵ����Ҫ���ص���һ��������󣬲�����дclose����)
			return dataSource.removeFirst();
		} else {
			throw new SQLException("ϵͳæ");
		}*/
		
		// ��д
		// ������ǿ����
		if (dataSource.size() > 0) {
			// ���������Ķ���
			Connection conn = dataSource.removeFirst();
			
			System.out.println("��ǰ��ļ�����" + DataSourcePool.class.getClassLoader());
			System.out.println("��ȡ�ö�����ʵ�ֵĽӿ�" + conn.getClass().getInterfaces());
			
			// ���ɴ������
			Connection proxy = 
					(Connection) Proxy.newProxyInstance(
							// ��ǰ��ļ�����
							DataSourcePool.class.getClassLoader(),
							// ��ȡ�ö�����ʵ�ֵĽӿ�(close ���� �ȵ�)
							conn.getClass().getInterfaces(),
							// ��̬������� -> �ں���ִ�е�ǰ��������
							new InvocationHandler() {

								@Override
								// ����
								public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
									// ��д conn ��close����
									// �ж��ַ����Ƿ����(ֻ���close����)
									if (method.getName().equals("close")) {
										// �����ӻ������ӳ�
										dataSource.add(conn);
										System.out.println("�������ӳ���");
										return null;
									} else {
										// ��������ֱ�ӵ��������Ķ������
										return method.invoke(conn, args);
									}
								}
								
							}
						);
			return proxy;
		} else {
			throw new SQLException("ϵͳæ");
		}
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
