package demo07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ת������
 * 		java.io.InputStreamReader �̳�Reader
 * 	�ֽ������ַ��������������ֽ���ת��Ϊ�ַ���
 * 
 *  ��ȡ�ķ�����
 *  	read() ��ȡһ���ֽڣ���ȡ�ַ�����
 *  
 *  ���ɣ�
 *  	OutputStreamWriter д���ļ�
 *  	InputStreamReader ���ļ�
 *  
 *  	OutputStreamWriter(OutputStream out)�����ֽ������
 *      InputStreamReader(InputStream in) �������е��ֽ�������
 *      
 *      	���Դ��ݵ��ֽ���������FileInputStream
 *      InputStreamReader(InputStream in, String charsetName) 
 *      ���ݱ����
 */

public class InputStreamReaderDemo01 {
	public static void main(String[] args) throws IOException {
		readUTF();
		readGBK();
	}
	
	/*
	 * ָ���ַ�����utf-8
	 */
	public static void readUTF() throws IOException {
		// ����������
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
		
		// ����ת��������
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		// �ַ�����ȡ
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch, 0, len));
		
		// �ر�
		isr.close();
	}
	
	/*
	 * ת������ָ������Ϊ GBK, Ĭ�ϱ���
	 */
	public static void readGBK() throws IOException {
		// ����������
		FileInputStream fis = new FileInputStream("F:\\a\\c.txt");
		// ����ת����
		InputStreamReader isr = new InputStreamReader(fis, "gbk");
		
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch, 0, len));
		
		// �ر�
		isr.close();
	}
}
