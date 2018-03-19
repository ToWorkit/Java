package com.itstar.demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将数据源：c:\\aa.txt
 * 复制到：d:\\aa.txt 数据目的
 * 
 * 字节输入流：绑定数据源
 * 字节输出流：绑定数据目的
 * 
 * 输入：读取一个字节
 * 输出：写一个字节
 * 
 */
public class CopyDemo {
	public static void main(String[] args) {
		//定义两个流对象变量
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
				throw new RuntimeException("释放资源失败");
			}finally {
				try {
					if(fis != null)
						fis.close();
				}catch(IOException ex) {
					throw new RuntimeException("释放资源失败");
				}
				
				
			}
			
		}
		
	}
}
