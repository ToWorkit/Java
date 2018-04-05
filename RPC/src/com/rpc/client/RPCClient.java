package com.rpc.client;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import com.rpc.server.MyBusiness;

public class RPCClient {
	public static void main(String[] args) throws IOException {
		// 调用Server的功能  
		MyBusiness proxy = RPC.getProxy(
				// 参数
				// 调用的接口
				MyBusiness.class,
				// 版本ID，要与服务器端一致
				MyBusiness.versionID,
				// 服务器的地址
				new InetSocketAddress("localhost", 7788),
				// 配置
				new Configuration()
			);
		
		// 使用
		System.out.println(proxy.sayHello("World"));
	}
}
