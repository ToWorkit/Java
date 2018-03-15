package com.itstar.demo01;

public class RegexDemo2 {
	public static void main(String[] args) {
		replaceAll();
	}
	
	/*
	 * "itstar12313213data123124124" 所有的数字替换掉
	 * String类的replaceAll(正则的规则，替换后的新字符串)
	 */
	
	public static void replaceAll() {
		String str = "itstar12313213data123124124";
		
		str = str.replaceAll("[\\d]", "#");
		System.out.println(str);
	}
}
