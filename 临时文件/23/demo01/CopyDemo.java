package com.itstar.demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������Դ��c:\\aa.txt
 * ���Ƶ���d:\\aa.txt ����Ŀ��
 * 
 * �ֽ���������������Դ
 * �ֽ��������������Ŀ��
 * 
 * ���룺��ȡһ���ֽ�
 * �����дһ���ֽ�
 * 
 */
public class CopyDemo {
	public static void main(String[] args) {
		//�����������������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\\\Download\\\\hadoop-2.6.4-src.tar.gz");
			fos = new FileOutputStream("d:\\\\hadoop-2.6.4-src.tar.gz");
			
			int len = 0;
			
			while((len = fis.read()) != -1) {
				fos.write(len);
			}
		}catch(IOException ex) {
			System.out.println(ex);
			throw new RuntimeException();
		}finally {
			try {
				if(fos!=null)
					fos.close();
			}catch(IOException ex) {
				throw new RuntimeException("�ͷ���Դʧ��");
			}finally {
				try {
					if(fis != null)
						fis.close();
				}catch(IOException ex) {
					throw new RuntimeException("�ͷ���Դʧ��");
				}
				
				
			}
			
		}
		
	}
}
