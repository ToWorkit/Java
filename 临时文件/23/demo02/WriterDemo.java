package com.itstar.demo02;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流
 *  java.io.Writer 所有字符输出流的超类
 * 写文件，写文本文件（局限性）
 * 
 * 写的方法Write
 * write(int c) 写一个字符
 * write(char[] c)写字符数组
 * write(char[] c,int,int) 字符数组的一部分 ，开始索引，写几个
 * write(String s) 写入字符串
 * 
 * writer的子类对象 FileWriter
 * 		file 类型对象
 * 		String 文件名
 * 
 * 字符输出流写数据的时候，必须要运行一个功能 ，刷新功能
 * flush
 */
public class WriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\aaa.txt");
		
		//写一个字符
		fw.write(100);
		fw.flush();
		
		//写字符数组
		char[] c = {'a','b','c','d'};
		fw.write(c);
		fw.flush();
		
		//字符数组的一部分 ，开始索引，写几个
		fw.write(c, 1, 2);
		fw.flush();
		
		fw.write("itstarbigdata");
		fw.flush();
		
		fw.close();
	}
}
