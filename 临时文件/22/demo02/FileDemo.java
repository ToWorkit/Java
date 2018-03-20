package com.itstar.demo02;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * File(File parent, String child)
	 * 传递路径，传递file类型父路径 传递字符串子路径
	 */
	public static void function_2() {
		File parent = new File("d:");
		File file = new File(parent, "eclipse");
		System.out.println(file);
	}
	
	/*
	 * File(String parent, String child)
	 * 传递路径： 传递字符串父路径 传递字符串子路径
	 * 灵活性高
	 */
	public static void function_1(String child) {
		File file = new File("d:", child);
		System.out.println(file);
	}
	
	/*
	 * File(String pathname) 
	 * 传递的路径名：可以写文件夹 可以写一个文件
	 * c:\\aaa    c:\\aaa\Demo.txt
	 * 将路径封装成File类型对象
	 */
	
	public static void function() {
		//主要获得file类对象
		File file = new File("d:\\eclipseB");
		System.out.println(file);
	}
}
