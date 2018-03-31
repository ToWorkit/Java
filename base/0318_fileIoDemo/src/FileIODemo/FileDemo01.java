package FileIODemo;

import java.io.File;

/*
 * 文件操作IO流
 */

public class FileDemo01 {
	public static void main(String[] args) {
		// File类静态成员变量 -> 与系统有关的分隔符
		String s = File.pathSeparator;
		System.out.println(s);
		
		// 文件分隔符
		String s1 = File.separator;
		System.out.println(s1);
		
	}
}
