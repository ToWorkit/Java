package com.itstar.demo02;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������
 *  java.io.Writer �����ַ�������ĳ���
 * д�ļ���д�ı��ļ��������ԣ�
 * 
 * д�ķ���Write
 * write(int c) дһ���ַ�
 * write(char[] c)д�ַ�����
 * write(char[] c,int,int) �ַ������һ���� ����ʼ������д����
 * write(String s) д���ַ���
 * 
 * writer��������� FileWriter
 * 		file ���Ͷ���
 * 		String �ļ���
 * 
 * �ַ������д���ݵ�ʱ�򣬱���Ҫ����һ������ ��ˢ�¹���
 * flush
 */
public class WriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\aaa.txt");
		
		//дһ���ַ�
		fw.write(100);
		fw.flush();
		
		//д�ַ�����
		char[] c = {'a','b','c','d'};
		fw.write(c);
		fw.flush();
		
		//�ַ������һ���� ����ʼ������д����
		fw.write(c, 1, 2);
		fw.flush();
		
		fw.write("itstarbigdata");
		fw.flush();
		
		fw.close();
	}
}
