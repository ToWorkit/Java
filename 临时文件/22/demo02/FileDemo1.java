package com.itstar.demo02;

import java.io.File;
import java.io.IOException;

/*
 * File类的创建和删除功能
 * 
 */
public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		function_2();
	}
	/*
	 * boolean delete()  
	 * 删除文件或者文件夹
	 * 删除成功返回true 删除失败返回false
	 * 不走回收站 直接从硬盘删除
	 */
	public static void function_2() {
		File file = new File("c:\\bb.txt\\cc.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	
	/*
	 *  boolean mkdir() 创建文件夹功能
	 *  
	 */
	public static void function_1() {
		//创建文件夹
		File file = new File("c:\\bb.txt\\cc.txt");
		//mkdirs创建多文件夹
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	
	/*
	 * boolean createNewFile()  创建文件!的功能
	 * 
	 */
	public static void function() throws IOException {
		File file = new File("c:\\新建文件夹");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}
