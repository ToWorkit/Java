package FileIODemo;

import java.io.File;

public class FileDemo02 {
	public static void main(String[] args) {
		fun();
		fun_01("Bandicam");
		fun_02();
	}
	
	/*
	 * File(File parent, String child)
	 * 传递路径，传递file类型父路径 传递字符串子路径
	 */
	public static void fun() {
		// 路径
		File parent = new File("d:");
		File file = new File(parent, "Bandicam");
		System.out.println(file);
	}
	
	/*
	 * File(String parent, String child)
	 * 传递路径： 传递字符串父路径 传递字符串子路径
	 * 灵活性高
	 */
	public static void fun_01(String child) {
		File file = new File("d:", child);
		System.out.println(file);
	}
	
	/*
	 * File(String pathname) 
	 * 传递的路径名：可以写文件夹 可以写一个文件
	 * c:\\aaa    c:\\aaa\Demo.txt
	 * 将路径封装成File类型对象
	 */
	public static void fun_02() {
		File file = new File("d:\\Bandicam");
		System.out.println(file);
	}
}
