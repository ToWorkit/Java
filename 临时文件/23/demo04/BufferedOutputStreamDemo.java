package com.itstar.demo04;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������ļ�
		FileOutputStream fos = new FileOutputStream("c:\\buffer.txt");
		//����������
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//дһ���ֽ�
		bos.write(88);
		
		//д�ֽ�����
		byte[] bytes = "itstar".getBytes();
		bos.write(bytes);
		bos.close();
		
	}
}
