package com.itstar.demo03;

public class IntegerDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Integer类的构造方法
	 * 	Integer(String s) 
	 * 将数字格式的字符串传递到Integer的构造方法中
	 * 
	 */
	public static void function_3() {
		Integer in = new Integer(5);
		int i = in.intValue();
		//System.out.println(i++);
		
	}
	
	/*
	 * 如何将基本数据类型转换为字符串呢
	 * int -> String
	 * Integer的方法 toString()
	 */
	public static void function_2(){
		int a = 1;
		//连接空串
		String s = a + "";
		//任何数据类型与字符串进行连接，都会变成字符串
		System.out.println(s+2);
		
		String s1 = Integer.toString(2);
		String s2 = Integer.toString(5, 2);
		System.out.println(s2+2);//1012
	}
	
	/*
	 * parseInt(String s, int radix)
	 * radix:基数 进制
	 * parseInt:运行结果是十进制
	 * 
	 */
	public static void function_1() {
		int a = Integer.parseInt("A", 16);
		System.out.println(a);
	}
	
	/*
	 * Integer类当中的方法：parseInt(String s) 返回值int(基本数据类型)
	 * 要求：字符串必须是数字格式的
	 */
	public static void function() {
		//输入的字符串有要求
		int a = Integer.parseInt("12");
		//转化为基本类型之后可以进行数学运算
		System.out.println(a/2);
	}
}
