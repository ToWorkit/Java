package com.proxy.mysql;

import java.sql.Connection;

public class TestDataSourceMain {

	public static void main(String[] args) throws Exception {
		//创建一个连接池
		DataSourcePool pool = new DataSourcePool();
		
		//取出链接使用
		for(int i=0;i<11;i++){
			Connection conn = pool.getConnection();
			
			// 修改后获取到的是代理对象
			System.out.println("第"+i + "个："+ conn);
			
			//关闭
			conn.close(); //----> 调用的是真正对象Connection.close方法  把该链接还给数据库，而不是还给连接池
		}

	}

}
