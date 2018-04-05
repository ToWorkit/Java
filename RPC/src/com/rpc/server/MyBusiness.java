package com.rpc.server;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface MyBusiness extends VersionedProtocol {
	// 指定一个版本号，使用这个版本号来创建签名
	public static long versionID = 1;
	
	// 定义自己的业务方法
	public String sayHello(String name);
}
