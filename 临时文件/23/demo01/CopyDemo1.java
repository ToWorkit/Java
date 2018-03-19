package com.itstar.demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流复制文件
 * 	采用数组缓冲提高效率
 *  字节数组
 *  
 *  FileInputStream
 *  FileOutputStream
 */
public class CopyDemo1 {
	public static void main(String[] args) {
		//定义两个流对象变量
				FileInputStream fis = null;
				FileOutputStream fos = null;
				try {
					fis = new FileInputStream("C:\\Download\\hadoop-2.6.4-src.tar.gz");
					fos = new FileOutputStream("d:\\hadoop-2.6.4-src.tar.gz");
					//定义数组，缓冲
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
