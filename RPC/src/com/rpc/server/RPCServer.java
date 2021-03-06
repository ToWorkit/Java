package com.rpc.server;

import java.io.IOException;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Server;

public class RPCServer {
	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		// 创建一个RPC Server
		RPC.Builder builder = new RPC.Builder(new Configuration());
		
		// 配置 指定Server的地址和端口
		builder.setBindAddress("localhost");
		builder.setPort(7788);
		
		// 发布程序
		// 定义的接口
		builder.setProtocol(MyBusiness.class);
		// 定义接口的实现
		builder.setInstance(new MyBusinessImpl());
		
		// 创建Server
		Server server = builder.build();
		// 启动Server
		server.start();
	}
}
