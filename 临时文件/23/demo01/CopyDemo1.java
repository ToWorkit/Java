package com.itstar.demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ��������ļ�
 * 	�������黺�����Ч��
 *  �ֽ�����
 *  
 *  FileInputStream
 *  FileOutputStream
 */
public class CopyDemo1 {
	public static void main(String[] args) {
		//�����������������
				FileInputStream fis = null;
				FileOutputStream fos = null;
				try {
					fis = new FileInputStream("C:\\Download\\hadoop-2.6.4-src.tar.gz");
					fos = new FileOutputStream("d:\\hadoop-2.6.4-src.tar.gz");
					//�������飬����
					byte[] bytes = new byte[1024];
					
					int len = 0;
					
					while((len = fis.read(bytes)) != -1) {
						fos.write(bytes,0,len);
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
