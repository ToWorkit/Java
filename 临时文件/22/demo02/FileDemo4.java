package com.itstar.demo02;

import java.io.File;

/*
 * File类的获取功能
 * 	list
 *  listFiles
 */
public class FileDemo4 {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * 获取系统的根目录
	 */
	public static void function_2() {
		File[] fileArr = File.listRoots();
		for(File f:fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 *  File[] listFiles()  
	 *  返回的是文件的全路径或者目录
	 */
	public static void function_1() {
		File file = new File("d:\\eclipse");
		File[] fileArr = file.listFiles();
		System.out.println(fileArr.length);
		for(File f:fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 * file类的获取功能
	 * String[] list()
	 * 遍历一个文件夹
	 */
	public static void function() {
		File file = new File("d:\\eclipse");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String s:strArr) {
			System.out.println(s);
		}
	}
}
