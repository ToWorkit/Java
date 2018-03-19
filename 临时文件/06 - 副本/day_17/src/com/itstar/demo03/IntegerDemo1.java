package com.itstar.demo03;

public class IntegerDemo1 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * Integer类的其它方法
	 *  包含了3个方法和2个静态成员变量
	 *  
	 *  方法：
	 *  	十进制转换为二进制toBinarString(int)
	 *  	十进制转换为八进制toOctalString(int)
	 *  	十进制转换为十六进制toHexString(int)
	 *  三个方法返回值都是以String类型返回
	 */
	public static void function() {
		//转换成二进制
		System.out.println(Integer.toBinaryString(99));
		//转换为八进制
		System.out.println(Integer.toOctalString(99));
		//转换为十六进制
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 * Integer类的静态成员变量
	 * 	MAX_VALE
	 *  MIN_VALUE
	 */
	public static void function_1() {
		//最大值 和最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
