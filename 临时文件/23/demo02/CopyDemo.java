package com.itstar.demo02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流复制文本文件，必须是文本文件
 * 
 * 读取数据源 FileReader
 * 数据目的 FileWriter
 */
public class CopyDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("c:\\aaa.txt");
			fw = new FileWriter("d:\\aaa.txt");
			char[] ch = new char[1024];//char占两个字节
			
			int len = 0;
			while((len = fr.read(ch)) != -1) {
				fw.write(ch, 0, len);
			}
		}catch(IOException ex) {
			System.out.println(ex);
			throw new RuntimeException("复制失败了");
		}finally {
			try {
				if(fw!=null)
					fw.flush();
					fw.close();
					
			}catch(IOException ex){
				throw new RuntimeException("释放资源失败了");
			}finally {
				try {
					if(fr!=null)
						fr.close();
				}catch(IOException ex) {
					throw new RuntimeException("释放资源失败了");
				
				
			}
			
		}
		
		
		}
	}
}
