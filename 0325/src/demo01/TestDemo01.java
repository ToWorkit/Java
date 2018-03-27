package demo01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

/*
 * ʹ��HDFS��Java API����һ��Ŀ¼
 * 
 * �����Ȩ������
 * 	org.apache.hadoop.security.AccessControlException: Permission denied: user=Just Do It, access=WRITE, inode="/test01":root:supergroup:drwxr-xr-x
 * 
 * �����ֽ������
 * 	1������ִ�г�����û���: root(HADOOP_USER_NAME)
 * 	2��ʹ��Java��-D����(�����л�ȡ����ֵ): HADOOP_USER_NAME
 * 	3��ʹ������ı�Ŀ¼��Ȩ��: hdfs dfs -chmod 777 /test01
 * 	4�������ļ��еĲ��� dfs.permissions Ȩ������Ϊfalse
 */

public class TestDemo01 {
	
	// ��ʹ��main�������Բ�������
	@Test
	public void test01() throws Exception {
		// 1������root�û�
		System.setProperty("HADOOP_USER_NAME", "root");
		
		// ָ��NameNode��ַ
		Configuration conf = new Configuration();
		
		// ��������
		// �������ļ�һ��
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// ����һ��HDFS�Ŀͻ���
		FileSystem client = FileSystem.get(conf);
		// ����Ŀ¼��Path����
		client.mkdirs(new Path("/test01"));
		
		// �رտͻ���
		client.close();
	}
}
