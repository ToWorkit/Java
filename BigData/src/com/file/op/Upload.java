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
		Upload_0("/input/dept.csv", "D:\\大数据第六期VIP课程\\正式课\\1129班课程资料\\1215- 大数据系统课 8\\图片笔记\\dept.csv");
		Upload_0("/input/emp.csv", "D:\\大数据第六期VIP课程\\正式课\\1129班课程资料\\1215- 大数据系统课 8\\图片笔记\\emp.csv");
		
	}

	public static void Upload_0(String HDFS_Path, String LOCALHOST_path) throws IOException {
		// 指定root用户，或者去修改配置文件，将权限设置改为false
		System.setProperty("HADOOP_USER_NAME", "root");
		
		// 使用HDFS的工具类上传文件

		// 配置
		Configuration conf = new Configuration();
		// 指定NameNode地址
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// 创建一个HDFS的客户端
		FileSystem client = FileSystem.get(conf);
		
		// 构造一个输出流(参数时path对象)，指向HDFS
		OutputStream out = client.create(new Path(HDFS_Path));
		// 构造一个输入流, 从本地读入文件数据
		InputStream in = new FileInputStream(LOCALHOST_path);
		
		// 使用HDFS的工具类来简化程序
		IOUtils.copyBytes(in, out, 1024);
	}
}
