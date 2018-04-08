package com.rpc.server;

import java.io.IOException;

import org.apache.hadoop.ipc.ProtocolSignature;

public class MyBusinessImpl implements MyBusiness {

	@Override
	public ProtocolSignature getProtocolSignature(String arg0, long arg1, int arg2) throws IOException {
		// ʹ�� versionID ����ǩ��
		return new ProtocolSignature(MyBusiness.versionID, null);
	}

	@Override
	public long getProtocolVersion(String arg0, long arg1) throws IOException {
		// ����ID
		return MyBusiness.versionID;
	}

	@Override
	public String sayHello(String name) {
		System.out.println("���õ���Server�˵ķ���");
		// ҵ�񷽷�
		return "Hello " + name;
	}

}
