package FileIODemo;

import java.io.File;

/*
 * File类的判断功能
 */

public class FileDemo05 {
	public static void main(String[] args) {
		fun_01();
	}
	
	/*
	 * boolean isDirectory() 
                测试此抽象路径名表示的文件是否是一个目录。
                 判断此路径是否是一个文件夹 是文件夹返回true 否则返回false
	 */
	public static void fun() {
		// 文件
		File file = new File("F:\\a\\b.txt");
		boolean b = file.isDirectory();
		System.out.println(b);
	}
	
	/*
	 * boolean exists() 
                  测试此抽象路径名表示的文件或目录是否存在。 
                 判断file构造方法中封装的路径是否存在
                  存在返回true 不存在返回false
	 */
	public static void fun_01() {
		File file = new File("F:\\a\\b.txt");
		boolean b = file.exists();
		System.out.println(b);
	}
}
