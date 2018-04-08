package com.rpc.server;

import java.io.IOException;

import org.apache.hadoop.ipc.ProtocolSignature;

public class MyBusinessImpl implements MyBusiness {

	@Override
	public ProtocolSignature getProtocolSignature(String arg0, long arg1, int arg2) throws IOException {
		// 使用 versionID 创建签名
		return new ProtocolSignature(MyBusiness.versionID, null);
	}

	@Override
	public long getProtocolVersion(String arg0, long arg1) throws IOException {
		// 返回ID
		return MyBusiness.versionID;
	}

	@Override
	public String sayHello(String name) {
		System.out.println("调用到了Server端的方法");
		// 业务方法
		return "Hello " + name;
	}

}
