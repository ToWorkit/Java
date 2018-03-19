package com.itstar.demo06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 读取文件
 * 	参数：
 * 		file类型对象
 * 		String对象
 * 
 * 输入流的使用：
 * 	1创建字节输入流的子类对象
 *  2调用读取方法
 *  3关闭资源
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\demo.txt");
		//读一个字节 a 97
		//int i = fis.read();
		//System.out.println(i);
		
//		i = fis.read();
//		System.out.println(i);
//		
//		i = fis.read();
//		System.out.println(i);
//		
//		i = fis.read();
//		System.out.println(i);-1
		
		int len = 0;
		while((len=fis.read())!= -1) {
			System.out.println((char)len);
		}
		
		fis.close();
	}
}
