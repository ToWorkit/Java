package demo01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

/*
 * 使用HDFS的Java API创建一个目录
 * 
 * 会出现权限问题
 * 	org.apache.hadoop.security.AccessControlException: Permission denied: user=Just Do It, access=WRITE, inode="/test01":root:supergroup:drwxr-xr-x
 * 
 * 有四种解决方案
 * 	1、设置执行程序的用户是: root(HADOOP_USER_NAME)
 * 	2、使用Java的-D参数(命令行获取参数值): HADOOP_USER_NAME
 * 	3、使用命令改变目录的权限: hdfs dfs -chmod 777 /test01
 * 	4、配置文件中的参数 dfs.permissions 权限设置为false
 */

public class TestDemo01 {
	
	// 不使用main函数可以测试运行
	@Test
	public void test01() throws Exception {
		// 1、设置root用户
		System.setProperty("HADOOP_USER_NAME", "root");
		
		// 指定NameNode地址
		Configuration conf = new Configuration();
		
		// 设置主机
		// 和配置文件一致
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// 创建一个HDFS的客户端
		FileSystem client = FileSystem.get(conf);
		// 创建目录（Path对象）
		client.mkdirs(new Path("/test01"));
		
		// 关闭客户端
		client.close();
	}
}
