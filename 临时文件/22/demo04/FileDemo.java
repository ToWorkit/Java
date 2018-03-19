package com.itstar.demo04;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File dir = new File("c:\\demo");
		getAllDir(dir);
	}
	
	//搞定全遍历
	public static void getAllDir(File dir) {
		//对dir遍历
		File[] filedir = dir.listFiles();
		for(File f:filedir) {
			//判断f是不是文件夹
			if(f.isDirectory()) {
				getAllDir(f);
			}else {
				System.out.println(f);
			}
		}
	}
}
