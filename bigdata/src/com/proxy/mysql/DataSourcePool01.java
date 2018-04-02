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
	
	// 初始化，创建10个链接放入连接池
	// jdbc
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.106.11:3306/hive";
	private static String user = "hiveowner";
	private static String password = "Password_1";
	
	// 定义一个链表来保存 10 个链接
	private static LinkedList<Connection> dataSource = new LinkedList<>();
	// 静态代码块
	static {
		try {
			// 注册驱动
			Class.forName(driver);
			
			for (int i = 0; i < 10; i++) {
				// jdbc连接
				dataSource.add(DriverManager.getConnection(url, user, password));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		// 连接池中有链接
		if (dataSource.size() > 0) {
			return dataSource.removeFirst();
		} else {
			throw new SQLException("系统忙");
		}
		
		/*Exception in thread "main" java.sql.SQLException: 系统忙
		at com.proxy.mysql.DataSourcePool01.getConnection(DataSourcePool01.java:48)
		at com.proxy.mysql.TestDataSourceMain01.main(TestDataSourceMain01.java:14)
		*/
		
		// 使用代理增强重写close方法，将链接还回到连接池而非数据库
/*		if (dataSource.size() > 0) {
			// 连接池里连接数据库的真正对象
			Connection conn = dataSource.removeFirst();
			// 生成代理对象
			Connection proxy = 
				(Connection) Proxy.newProxyInstance(
					DataSourcePool01.class.getClassLoader(),
					conn.getClass().getInterfaces(),
					new InvocationHandler() {
	
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							// 重写close方法
							if (method.getName().equals("close")) {
								// 将链接还给连接池而非还给数据库
								dataSource.add(conn);
								System.out.println("还给了连接池");
								return null;
							} else {
								// 其他的方法还是调用真正的对象完成就好
								return method.invoke(conn, args);
							}
						}
						
					}
			);
			return proxy;
		} else {
			throw new SQLException("系统忙");
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
