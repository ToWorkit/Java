package demo05;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ��������
 * 
 * 	java.io.OutputStream�������ֽ�������ĳ���
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

public class FileOutPutStreamDemo01 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("F:\\a\\c.txt");
		// ����write����д����
		fos.write(100);
		fos.write(99);
		fos.write(98);
		fos.write(97);
		
		// д�ֽ�����
		byte[] bytes = {65, 66, 67, 68, 69};
		fos.write(bytes);
		
		// д�ֽ������һ����
		fos.write(bytes, 1, 3);
		
		// д���ַ�
		fos.write("Hello World".getBytes());
		
		// ����ر�
		fos.close();
	}
}
