package FileIODemo;

import java.io.File;

public class FileDemo04 {
	public static void main(String[] args) {
		fun_03();
	}
	
	/*
	 *  String getParent() 返回String
	 *  获取的是父路径
	 *  File getParentFile 返回file对象
	 */
	public static void fun() {
		File file = new File("F:\\a\\b.txt");
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
	public static void fun_01() {
		File file = new File("src");
		String str_absolut = file.getAbsolutePath();
		System.out.println(str_absolut);
		
		File file_absolut = file.getAbsoluteFile();
		System.out.println(file_absolut);
	}
	
	/*
	 *  long length() 
                    返回由此抽象路径名表示的文件的长度。 
                    返回路径中的文件的字节数，没有这个文件返回0
	 */
	public static void fun_02() {
		File file = new File("F:\\a\\b.txt");
		long l = file.length();
		System.out.println(l);
	}
	
	/*
	 * String getName()  
	 * 返回由此抽象路径名表示的文件或目录的名称。
	 * 获取路径的最后名字，不管有没有
	 */
	public static void fun_03() {
		File file = new File("F:\\a\\b.txt");
		String name = file.getName();
		System.out.println(name);
	}
}
