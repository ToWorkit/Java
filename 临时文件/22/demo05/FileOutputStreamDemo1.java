package com.itstar.demo05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ļ�����д�ͻ��з���
 * 	����\r\n
 */
public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("c:\\b.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		
		fos.write("itstar\r\n".getBytes());
		fos.write("haha".getBytes());
		fos.close();
	}
}
