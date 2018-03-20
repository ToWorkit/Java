package com.itstar.demo05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ��������
 * 
 * 	java.io.OutputStream�� �����ֽ�������ĳ���
 *  ���ã���java����д���ļ�
 *  �ֽڣ�ÿ�β����ļ�ֵ����һ���ֽ�
 *  д�����ļ�
 *  
 *  ��������д���ļ��ķ�����
 *  	write(int b) д��һ���ֽ� 
 *  	write(byte[] b) д����ֽ�����
 *  	write(byte[] b,int,int) д���ֽ�����,int��ʼд�������,intд����
 *  	close() �ر��������ͷ�������ص���Դ
 *  
 *  FileOutputStream
 *  	д�������ļ�
 *  
 *  ����Ĺ��췽����
 *  	������
 *  		File����   	��װ�ļ�
 *  		String����	�ַ������ļ���
 *  
 *  	������ʹ�ã�
 *  		1.�������������
 *  		2.���ö���ķ���writeд
 *  		3.close�ͷ���Դ
 *  
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\a.txt");
		//���ö���writeд����
		fos.write(100);//d
		
		fos.write(49);
		fos.write(48);
		fos.write(48);
		
		//д�ֽ�����
		byte[] bytes = {65,66,67,68};
		fos.write(bytes);
		
		//д�ֽ������һ����
		fos.write(bytes, 1, 2);
		
		fos.write("itstar".getBytes());
		
		//�ر���Դ
		fos.close();
	}
}
