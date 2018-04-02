package demo01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

/*
 * 上传文件
 */

public class TestUpload {
	@Test
	// 原生态
	public void testUpload01() throws Exception {
		// 指定root用户，或者去修改配置文件，将权限设置改为false
		System.setProperty("HADOOP_USER_NAME", "root");
		
		// 指定NameNode的地址
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// 创建一个HDFS的客户端
		FileSystem client = FileSystem.get(conf);
		
		// 构造一个输出流，指向HDFS
		OutputStream out = client.create(new Path("/test01/test.tar.gz"));
		// 构造一个输入流，从本地读取文件
		InputStream in = new FileInputStream("d:\\hadoop-2.7.3.tar.gz");
		
		// 原生的java基本io
		// 缓冲区
		byte[] buffer = new byte[1024];
		// 读取的长度
		int len = 0;
		// 确认可以读取到数据
		while((len = in.read(buffer)) > 0) {
			// 再输出
			out.write(buffer, 0, len);
		}
		// 刷新
		out.flush();
		
		// 关闭流
		out.close();
		in.close();
	}
	
	@Test
	public void testUpload2() throws Exception{
		//使用HDFS的工具类来简化程序
		//指定NameNode地址
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://bigdata11:9000");
		
		//创建一个HDFS的客户端
		FileSystem client = FileSystem.get(conf);	
		
		//构造一个输出流，指向HDFS
		OutputStream out = client.create(new Path("/test01/test.tar.gz"));
		
		//构造一个输入流，从本地文件读入数据
		InputStream in = new FileInputStream("d:\\temp\\hadoop-2.7.3.tar.gz");
		
		//使用HDFS的工具类来简化程序
		IOUtils.copyBytes(in, out, 1024);
	}
}
