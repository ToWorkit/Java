package com.file.op;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class Upload {
	public static void main(String[] args) throws IOException {
		Upload_0("/input/dept.csv", "D:\\�����ݵ�����VIP�γ�\\��ʽ��\\1129��γ�����\\1215- ������ϵͳ�� 8\\ͼƬ�ʼ�\\dept.csv");
		Upload_0("/input/emp.csv", "D:\\�����ݵ�����VIP�γ�\\��ʽ��\\1129��γ�����\\1215- ������ϵͳ�� 8\\ͼƬ�ʼ�\\emp.csv");
		
	}

	public static void Upload_0(String HDFS_Path, String LOCALHOST_path) throws IOException {
		// ָ��root�û�������ȥ�޸������ļ�����Ȩ�����ø�Ϊfalse
		System.setProperty("HADOOP_USER_NAME", "root");
		
		// ʹ��HDFS�Ĺ������ϴ��ļ�

		// ����
		Configuration conf = new Configuration();
		// ָ��NameNode��ַ
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// ����һ��HDFS�Ŀͻ���
		FileSystem client = FileSystem.get(conf);
		
		// ����һ�������(����ʱpath����)��ָ��HDFS
		OutputStream out = client.create(new Path(HDFS_Path));
		// ����һ��������, �ӱ��ض����ļ�����
		InputStream in = new FileInputStream(LOCALHOST_path);
		
		// ʹ��HDFS�Ĺ��������򻯳���
		IOUtils.copyBytes(in, out, 1024);
	}
}
