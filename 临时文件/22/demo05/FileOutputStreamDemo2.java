package com.itstar.demo05;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) {
		//����������
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:\\demo.txt");
			fos.write(97);
		}catch(IOException ex) {
			
			System.out.println(ex.getMessage());
			throw new RuntimeException("�ļ�д��ʧ�ܣ������³���");
		}finally {
			
			try {
				if(fos != null)
					fos.close();
			}catch(IOException ex) {
				throw new RuntimeException("�ر���Դʧ��");
			}
		}
	}
}
