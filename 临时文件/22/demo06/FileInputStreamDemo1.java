package com.itstar.demo06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream��ȡ�ļ�
 *  �������Ч�ʣ�
 *  
 */
public class FileInputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\demo.txt");
		//�����ֽ�����
		byte[] b = new byte[2];
		
		int len = fis.read(b);
		
		System.out.println(new String(b));//ab
		System.out.println(len);//2
		
		len = fis.read(b);
		
		System.out.println(new String(b));//cd
		System.out.println(len);//2
		
		len = fis.read(b);
		
		System.out.println(new String(b));//ed
		System.out.println(len);//1
		
		len = fis.read(b);
		
		System.out.println(new String(b));//ed
		System.out.println(len);//-1
	}
}
