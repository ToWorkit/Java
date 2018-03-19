package com.itstar.demo02;

import java.io.File;

/*
 * file类的判断功能
 */
public class FileDemo3 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * boolean isDirectory() 
                测试此抽象路径名表示的文件是否是一个目录。
                 判断此路径是否是一个文件夹 是文件夹返回true 是文件返回false
	 */
	public static void function_1() {
		File file = new File("d:\\eclipse\\eclipse.exe");
		boolean b = file.isDirectory();
		System.out.println(b);
	}
	
	/*
	 * boolean exists() 
                  测试此抽象路径名表示的文件或目录是否存在。 
                 判断file构造方法中封装的路径是否存在
                  存在返回true 不存在返回false
	 */
	public static void function() {
		File file = new File("d:\\eclipseB");
		boolean b = file.exists();
		System.out.println(b);
	}
}
