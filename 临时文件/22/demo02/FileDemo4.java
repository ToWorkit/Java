package com.itstar.demo02;

import java.io.File;

/*
 * File��Ļ�ȡ����
 * 	list
 *  listFiles
 */
public class FileDemo4 {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * ��ȡϵͳ�ĸ�Ŀ¼
	 */
	public static void function_2() {
		File[] fileArr = File.listRoots();
		for(File f:fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 *  File[] listFiles()  
	 *  ���ص����ļ���ȫ·������Ŀ¼
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
	 * file��Ļ�ȡ����
	 * String[] list()
	 * ����һ���ļ���
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
