package com.rpc.server;

import java.io.IOException;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Server;

public class RPCServer {
	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		// ����һ��RPC Server
		RPC.Builder builder = new RPC.Builder(new Configuration());
		
		// ���� ָ��Server�ĵ�ַ�Ͷ˿�
		builder.setBindAddress("localhost");
		builder.setPort(7788);
		
		// ��������
		// ����Ľӿ�
		builder.setProtocol(MyBusiness.class);
		// ����ӿڵ�ʵ��
		builder.setInstance(new MyBusinessImpl());
		
		// ����Server
		Server server = builder.build();
		// ����Server
		server.start();
	}
}
