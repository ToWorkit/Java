package com.rpc.client;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import com.rpc.server.MyBusiness;

public class RPCClient {
	public static void main(String[] args) throws Exception {
		// ����Server�Ĺ���
		MyBusiness proxy = RPC.getProxy(
				// ���õĽӿ�
				MyBusiness.class,
				// �汾��ID���������������һ��
				MyBusiness.versionID,
				// �������˵ĵ�ַ
				new InetSocketAddress("localhost", 7788), 
				new Configuration());
		// ���÷���
		System.out.println(proxy.sayHello("World"));
	}
}
