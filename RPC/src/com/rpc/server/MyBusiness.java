package com.rpc.server;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface MyBusiness extends VersionedProtocol {
	// ָ��һ���汾�ţ�ʹ������汾��������ǩ��
	public static long versionID = 1;
	
	// �����Լ���ҵ�񷽷�
	public String sayHello(String name);
}
