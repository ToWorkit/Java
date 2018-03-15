package com.itstar.demo01;

public class RegexDemo1 {
	public static void main(String[] args) {
		split_3();
	}
	/*
	 * String类方法split对字符串进行切割
	 * 192.168.50.146 切割ip地址
	 */
	public static void split_3() {
		String str = "192.168.50.146";
		//.代表的是任意字符 所以都匹配 切碎了 数字长度 加\\正则表达式2个算一个
		String[] arr = str.split("\\.");
		System.out.println("数组的长度为："+arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	/*
	 * String类方法split对字符串进行切割
	 * 22 33 44 55
	 */
	public static void split_2() {
//		String str = "22 33 44 55";
//		String[] arr = str.split(" ");
//		System.out.println("数组的长度为："+arr.length);
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//如果出现了多个空格
		String str = "22 33     44    55";
		String[] arr = str.split(" +");
		System.out.println("数组的长度为："+arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	/*
	 * String类方法split对字符串进行切割
	 * 22-33-44-55  按照-进行切割
	 */
	public static void split_1() {
		String str = "22-33-44-55";
		//切割  数组作为容器接收
		String[] arr = str.split("-");
		System.out.println("数组的长度为："+arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
