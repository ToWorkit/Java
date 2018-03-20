package com.itstar.demo01;

import java.io.File;

/*
 * java.io.File
 * 	将操作系统中的文件，目录，路径封装成了file对象
 *  提供了方法 操作系统中的内容
 *  
 *  文件：file
 *  目录：diretory
 *  路径：path
 */
public class FileDemo {
	public static void main(String[] args) {
		//File类静态成员变量
		//static String pathSeparator  与系统有关的分隔符
		String s = File.pathSeparator;//linux是:
		System.out.println(s);
		
		String s1 = File.separator;
		System.out.println(s1);//windows "\" linux /
	}
}
