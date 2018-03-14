package com.itstar.demo02;
/*
 * String类的构造方法
 * 重载的形式
 */
public class StringDemo03 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * 定义方法，String类的构造方法
	 * String(byte[] bytes) 传递字节数组
	 * 
	 * 
	 * 
	 */
	public static void function() {
		//将字节数组当中的每个字节，查询了编码表，得到结果
		byte[] bytes = {-11,-45,-99};
		String str = new String(bytes);
		System.out.println(str);
	}
	
	/*
	 * 	String(byte[] bytes, int offset, int length)
	 *  字节数组的一部分转换为字符串
	 *  offset 数组的起始索引
	 *  length 个数
	 */
	
	public static void function_1() {
		byte[] bytes1 = {65,66,67,68,69};
		String s = new String(bytes1, 1, 2);
		System.out.println(s);
	}
}
