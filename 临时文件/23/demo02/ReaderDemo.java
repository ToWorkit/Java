package com.itstar.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流读取文本文件，所有字符输入流的超类
 * 	java.io.Reader
 *  专门读取文本文件
 *  
 * int read() 读取一个字节
 * int read(char[] c) 读取字符数组
 * 
 * Reader类属于抽象类，子类对象FileReader
 * 
 * 构造方法：绑定数据源
 * 	参数：
 * 		File 类型对象
 * 		String 文件名
 */
public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\aa.txt");
		
//		int len = 0;
//		while((len = fr.read()) != -1) {
//			System.out.print((char)len);
//		}
		
		//读字符数组
		char[] ch = new char[1024];
		int len = 0;
		
		while((len = fr.read(ch))!= -1) {
			System.out.println(new String(ch,0,len));
		}
		
		fr.close();
	}
}
