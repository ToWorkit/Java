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
 * �ϴ��ļ�
 */

public class TestUpload {
	@Test
	// ԭ��̬
	public void testUpload01() throws Exception {
		// ָ��root�û�������ȥ�޸������ļ�����Ȩ�����ø�Ϊfalse
		System.setProperty("HADOOP_USER_NAME", "root");
		
		// ָ��NameNode�ĵ�ַ
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		// ����һ��HDFS�Ŀͻ���
		FileSystem client = FileSystem.get(conf);
		
		// ����һ���������ָ��HDFS
		OutputStream out = client.create(new Path("/test01/test.tar.gz"));
		// ����һ�����������ӱ��ض�ȡ�ļ�
		InputStream in = new FileInputStream("d:\\hadoop-2.7.3.tar.gz");
		
		// ԭ����java����io
		// ������
		byte[] buffer = new byte[1024];
		// ��ȡ�ĳ���
		int len = 0;
		// ȷ�Ͽ��Զ�ȡ������
		while((len = in.read(buffer)) > 0) {
			// �����
			out.write(buffer, 0, len);
		}
		// ˢ��
		out.flush();
		
		// �ر���
		out.close();
		in.close();
	}
	
	@Test
	public void testUpload2() throws Exception{
		//ʹ��HDFS�Ĺ��������򻯳���
		//ָ��NameNode��ַ
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://bigdata11:9000");
		
		//����һ��HDFS�Ŀͻ���
		FileSystem client = FileSystem.get(conf);	
		
		//����һ���������ָ��HDFS
		OutputStream out = client.create(new Path("/test01/test.tar.gz"));
		
		//����һ�����������ӱ����ļ���������
		InputStream in = new FileInputStream("d:\\temp\\hadoop-2.7.3.tar.gz");
		
		//ʹ��HDFS�Ĺ��������򻯳���
		IOUtils.copyBytes(in, out, 1024);
	}
}
