package com.rpc.client;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import com.rpc.server.MyBusiness;

public class RPCClient {
	public static void main(String[] args) throws Exception {
		// 调用Server的功能
		MyBusiness proxy = RPC.getProxy(
				// 调用的接口
				MyBusiness.class,
				// 版本的ID，必须跟服务器端一致
				MyBusiness.versionID,
				// 服务器端的地址
				new InetSocketAddress("localhost", 7788), 
				new Configuration());
		// 调用方法
		System.out.println(proxy.sayHello("World"));
	}
}
