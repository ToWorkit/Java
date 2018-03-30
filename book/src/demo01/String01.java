package demo01;

import java.util.Scanner;

public class String01 {
	private static String s = "123";
	public static void main(String[] args) {
		String message = "Hello World";
		System.out.println(message.length()); // 11
		System.out.println(message.charAt(0)); // H
		
		// 控制台读取文本
/*		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println("键入" + s);*/
		
		// 比较字符串的方法
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.substring(0, 2));
		
		// 字符串数字转int型数字
		int intVal = Integer.parseInt(s);
		System.out.println(intVal + 1);
		
		// 是否是以指定字符开头
		System.out.println(s1.startsWith("H"));
		// 是否是以指定字符结尾
		System.out.println(s1.endsWith("l"));
		// 指定字符是否是该字符串的子串
		System.out.println(s1.contains("o"));
	}
}
