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
	
	
	// 初始化，创建 十个 链接放入连接池
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.106.11:3306/hive";
	private static String user = "hiveowner";
	private static String password = "Password_1";
	
	// 定义一个链表来保存 10个 链接
	private static LinkedList<Connection> dataSource = new LinkedList<Connection>();
	
	// 静态代码块，只执行一次
	static {
		try {
			// 注册驱动
			Class.forName(driver);
			// 创建十个链接
			for (int i = 0; i < 10; i++) {
				dataSource.add(DriverManager.getConnection(url, user, password));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
/*		// 表示从连接池中获取连接对象
		if (dataSource.size() > 0) {
			// 这里返回的链接是真正的对象(实际需要返回的是一个代理对象，并且重写close方法)
			return dataSource.removeFirst();
		} else {
			throw new SQLException("系统忙");
		}*/
		
		// 改写
		// 代理增强对象
		if (dataSource.size() > 0) {
			// 接收真正的对象
			Connection conn = dataSource.removeFirst();
			
			System.out.println("当前类的加载器" + DataSourcePool.class.getClassLoader());
			System.out.println("获取该对象所实现的接口" + conn.getClass().getInterfaces());
			
			// 生成代理对象
			Connection proxy = 
					(Connection) Proxy.newProxyInstance(
							// 当前类的加载器
							DataSourcePool.class.getClassLoader(),
							// 获取该对象所实现的接口
							conn.getClass().getInterfaces(),
							// 动态代理对象 -> 在函数执行前后做一下操作
							new InvocationHandler() {

								@Override
								public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
									// TODO Auto-generated method stub
									return null;
								}
								
							}
						);
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
