package com.file.op;

import java.util.Arrays;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

public class MetaData {
	@Test
	public void test01() throws Exception {
		// 指定NameNode地址
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// 创建HDFS客户端
		FileSystem client = FileSystem.get(conf);
		
		// 获取信息
		FileStatus[] faList = client.listStatus(new Path("/test01"));
		for (FileStatus s: faList) {
			System.out.println("是文件还是目录?" + (s.isDirectory() ? "目录":"文件"));
			System.out.println(s.getPath().toString());
		}
	}
	
	@Test
	public void test02() throws Exception {
		// 指定NameNode地址
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// 创建HDFS客户端
		FileSystem client = FileSystem.get(conf);
		
		// 获取文件信息
		FileStatus fs = client.getFileStatus(new Path("/test01/test.tar.gz"));
		
		/*
		 * 通过文件的FileStatus获取相应的数据块信息
		 * 0 从头开始
		 * fs.getLen() 文件的长度
		 * 返回值 数据的数组
		 */
		BlockLocation[] blkt = client.getFileBlockLocations(fs, 0, fs.getLen());
		for (BlockLocation b: blkt) {
			// 数据块的主机信息：数组，表示同一个数据块的多个副本(冗余)被保存到了不同的主机上
			System.out.println(Arrays.toString(b.getHosts()));
			// 获取数据块的名称
			System.out.println(Arrays.toString(b.getNames()));
		}
		client.close();
	}
}
