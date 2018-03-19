package com.itstar.demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

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
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//readGBK();
		readUTF();
	}
	/*
	 * ָ���ַ�����utf-8
	 */
	public static void readUTF() throws IOException {
		//����������
		FileInputStream fis = new FileInputStream("c:\\UTF.txt");
		
		//����ת��������
		InputStreamReader isr =  new InputStreamReader(fis,"UTF-8");
		
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch,0,len));
		isr.close();
	}
	
	/*
	 * ת������InputStreamReader
	 * ָ���ַ����� GBK
	 * Ĭ�ϵ�GBK
	 */
	
	public static void readGBK() throws IOException {
		//����������
		FileInputStream fis = new FileInputStream("c:\\UTF.txt");
		
		//����ת��������
		InputStreamReader isr =  new InputStreamReader(fis);
		
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch,0,len));
		isr.close();
	}
}
