package com.itstar.demo06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ��ȡ�ļ�
 * 	������
 * 		file���Ͷ���
 * 		String����
 * 
 * ��������ʹ�ã�
 * 	1�����ֽ����������������
 *  2���ö�ȡ����
 *  3�ر���Դ
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\demo.txt");
		//��һ���ֽ� a 97
		//int i = fis.read();
		//System.out.println(i);
		
//		i = fis.read();
//		System.out.println(i);
//		
//		i = fis.read();
//		System.out.println(i);
//		
//		i = fis.read();
//		System.out.println(i);-1
		
		int len = 0;
		while((len=fis.read())!= -1) {
			System.out.println((char)len);
		}
		
		fis.close();
	}
}
