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
		// ָ��NameNode��ַ
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// ����HDFS�ͻ���
		FileSystem client = FileSystem.get(conf);
		
		// ��ȡ��Ϣ
		FileStatus[] faList = client.listStatus(new Path("/test01"));
		for (FileStatus s: faList) {
			System.out.println("���ļ�����Ŀ¼?" + (s.isDirectory() ? "Ŀ¼":"�ļ�"));
			System.out.println(s.getPath().toString());
		}
	}
	
	@Test
	public void test02() throws Exception {
		// ָ��NameNode��ַ
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// ����HDFS�ͻ���
		FileSystem client = FileSystem.get(conf);
		
		// ��ȡ�ļ���Ϣ
		FileStatus fs = client.getFileStatus(new Path("/test01/test.tar.gz"));
		
		/*
		 * ͨ���ļ���FileStatus��ȡ��Ӧ�����ݿ���Ϣ
		 * 0 ��ͷ��ʼ
		 * fs.getLen() �ļ��ĳ���
		 * ����ֵ ���ݵ�����
		 */
		BlockLocation[] blkt = client.getFileBlockLocations(fs, 0, fs.getLen());
		for (BlockLocation b: blkt) {
			// ���ݿ��������Ϣ�����飬��ʾͬһ�����ݿ�Ķ������(����)�����浽�˲�ͬ��������
			System.out.println(Arrays.toString(b.getHosts()));
			// ��ȡ���ݿ������
			System.out.println(Arrays.toString(b.getNames()));
		}
		client.close();
	}
}
