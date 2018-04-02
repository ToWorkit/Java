package com.proxy.mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDataSourceMain01 {
	public static void main(String[] args) throws SQLException {
		// 创建一个连接池
		DataSourcePool01 pool = new DataSourcePool01();
		
		// 取出链接使用
		for (int i = 0; i < 11; i++) {
			// 调用方法
			Connection conn = pool.getConnection();
			
			System.out.println("第" + i + "个：" + conn);
			
			// 关闭 -> 调用的是真正的对象
			// 把该链接还给数据库而不是连接池(因为已经没有连接了所以抛出异常)
			conn.close(); // 使用动态代理重写了close方法
		}
	}
}
