package FileIODemo;

import java.io.File;

/*
 * File类的获取功能
 * 	list
 *  listFiles
 */

public class FileDemo06 {
	public static void main(String[] args) {
//		fun();
		fun_02();
	}
	
	/*
	 * 获取系统的根目录
	 */
	public static void fun() {
		File[] fileArr = File.listRoots();
		for (File f: fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 *  File[] listFiles()  
	 *  返回的是文件的全路径或者目录
	 */
	public static void fun_01() {
		File file = new File("F:\\a");
		File[] fileArr = file.listFiles();
		System.out.println(fileArr.length);
		for(File f: fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 * file类的获取功能
	 * String[] list()
	 * 遍历一个文件夹
	 */
	public static void fun_02() {
		File file = new File("F:\\lol");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String s: strArr) {
			System.out.println(s);
		}
	}
}
