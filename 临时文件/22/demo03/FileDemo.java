package com.itstar.demo03;

import java.io.File;

/*
 * File类的获取，文件获取过滤器
 * 遍历文件目录的时候，根据需求，来获取满足条件的文件
 * 遍历目录：listFiles()
 * listFiles(FileFilter filter)文件的过滤
 * 传递了FileFilter接口的实现类
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("c:\\demo");
		File[] fileArr = file.listFiles(new MyFilter());
		for(File f:fileArr) {
			
			System.out.println(f);
		}
	}
}
