package demo01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

/*
 * ����
 */

public class TestDownload {
/*	@Test
	public void testDownload() throws Exception{
		//ָ��NameNode��ַ
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		//����һ��HDFS�Ŀͻ���
		FileSystem client = FileSystem.get(conf);	
		
		//��HDFS��ȡһ��������
		InputStream in = client.open(new Path("/test01/test.tar.gz"));
		
		//����һ���������ָ�򱾵ؽ�������
		OutputStream out = new FileOutputStream("d:\\test.tar.gz");
		
		//������Java�Ļ���IO
		//������
		byte[] buffer = new byte[1024];
		//����
		int len = 0;
		while((len=in.read(buffer)) > 0){
			//��ʾ���������ݣ������
			out.write(buffer,0,len);
		}
		
		out.flush();
		
		out.close();
		in.close();		
	}*/
	
	// ʹ��HDFS������
	@Test
	public void testDownload1() throws Exception{
		//ָ��NameNode��ַ
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://192.168.106.11:9000");
		
		//����һ��HDFS�Ŀͻ���
		FileSystem client = FileSystem.get(conf);	
		
		//��HDFS��ȡһ��������
		InputStream in = client.open(new Path("/test01/test.tar.gz"));
		
		//����һ���������ָ�򱾵ؽ�������
		OutputStream out = new FileOutputStream("d:\\test.tar.gz");
		
		//ʹ��HDFS�Ĺ��������򻯳���
		IOUtils.copyBytes(in, out, 1024);
	}
}
