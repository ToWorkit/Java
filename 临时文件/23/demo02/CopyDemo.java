package com.itstar.demo02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ��������ı��ļ����������ı��ļ�
 * 
 * ��ȡ����Դ FileReader
 * ����Ŀ�� FileWriter
 */
public class CopyDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("c:\\aaa.txt");
			fw = new FileWriter("d:\\aaa.txt");
			char[] ch = new char[1024];//charռ�����ֽ�
			
			int len = 0;
			while((len = fr.read(ch)) != -1) {
				fw.write(ch, 0, len);
			}
		}catch(IOException ex) {
			System.out.println(ex);
			throw new RuntimeException("����ʧ����");
		}finally {
			try {
				if(fw!=null)
					fw.flush();
					fw.close();
					
			}catch(IOException ex){
				throw new RuntimeException("�ͷ���Դʧ����");
			}finally {
				try {
					if(fr!=null)
						fr.close();
				}catch(IOException ex) {
					throw new RuntimeException("�ͷ���Դʧ����");
				
				
			}
			
		}
		
		
		}
	}
}
