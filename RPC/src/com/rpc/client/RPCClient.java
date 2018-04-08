package com.rpc.client;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import com.rpc.server.MyBusiness;

public class RPCClient {
	public static void main(String[] args) throws IOException {
		// ����Server�Ĺ���  
		MyBusiness proxy = RPC.getProxy(
				// ����
				// ���õĽӿ�
				MyBusiness.class,
				// �汾ID��Ҫ���������һ��
				MyBusiness.versionID,
				// �������ĵ�ַ
				new InetSocketAddress("localhost", 7788),
				// ����
				new Configuration()
			);
		
		// ʹ��
		System.out.println(proxy.sayHello("World"));
	}
}
