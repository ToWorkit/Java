package com.itstar.demo02;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 *  String getParent() 返回String
	 *  获取的是父路径
	 *  File getParentFile 返回file对象
	 */
	public static void function_3() {
		File file = new File("d:\\eclipse\\eclipse.exe");
		File parent = file.getParentFile();
		System.out.println(parent);
	}
	
	/*
	 *  String getAbsolutePath() 
                     返回此抽象路径名的绝对路径名字符串。
                     获取绝对路径  返回String对象
         File getAbsoluteFile()
                     获取绝对路径     返回file对象         
                     如果写一个相对路径，返回该位置的工程的根目录             
	 */
	public static void function_2() {
		File file = new File("src");
//		String absolute = file.getAbsolutePath();
//		System.out.println(absolute);
		File absolute = file.getAbsoluteFile();
		System.out.println(absolute);
	}
	
	/*
	 *  long length() 
                    返回由此抽象路径名表示的文件的长度。 
                    返回路径中的文件的字节数，没有这个文件返回0
	 */
	public static void function_1() {
		//拿到文件
		File file = new File("d:\\eclipse\\eclipse.exe");
		long l = file.length();
		System.out.println(l);
	}
	
	/*
	 * String getName()  
	 * 返回由此抽象路径名表示的文件或目录的名称。
	 * 获取路径的最后名字，有没有不管
	 */
	
	public static void function() {
		//拿到文件
		File file = new File("d:\\eclipse\\eclipseB.exe");
		String name = file.getName();
		System.out.println(name);
	}
}
