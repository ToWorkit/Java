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

public class DataSourcePool01 implements DataSource {
	
	// ��ʼ��������10�����ӷ������ӳ�
	// jdbc
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.106.11:3306/hive";
	private static String user = "hiveowner";
	private static String password = "Password_1";
	
	// ����һ������������ 10 ������
	private static LinkedList<Connection> dataSource = new LinkedList<>();
	// ��̬�����
	static {
		try {
			// ע������
			Class.forName(driver);
			
			for (int i = 0; i < 10; i++) {
				// jdbc����
				dataSource.add(DriverManager.getConnection(url, user, password));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		// ���ӳ���������
		if (dataSource.size() > 0) {
			return dataSource.removeFirst();
		} else {
			throw new SQLException("ϵͳæ");
		}
		
		/*Exception in thread "main" java.sql.SQLException: ϵͳæ
		at com.proxy.mysql.DataSourcePool01.getConnection(DataSourcePool01.java:48)
		at com.proxy.mysql.TestDataSourceMain01.main(TestDataSourceMain01.java:14)
		*/
		
		// ʹ�ô�����ǿ��дclose�����������ӻ��ص����ӳض������ݿ�
/*		if (dataSource.size() > 0) {
			// ���ӳ����������ݿ����������
			Connection conn = dataSource.removeFirst();
			// ���ɴ������
			Connection proxy = 
				(Connection) Proxy.newProxyInstance(
					DataSourcePool01.class.getClassLoader(),
					conn.getClass().getInterfaces(),
					new InvocationHandler() {
	
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							// ��дclose����
							if (method.getName().equals("close")) {
								// �����ӻ������ӳض��ǻ������ݿ�
								dataSource.add(conn);
								System.out.println("���������ӳ�");
								return null;
							} else {
								// �����ķ������ǵ��������Ķ�����ɾͺ�
								return method.invoke(conn, args);
							}
						}
						
					}
			);
			return proxy;
		} else {
			throw new SQLException("ϵͳæ");
		}*/
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
