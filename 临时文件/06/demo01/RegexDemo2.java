package com.itstar.demo01;

public class RegexDemo2 {
	public static void main(String[] args) {
		replaceAll();
	}
	
	/*
	 * "itstar12313213data123124124" ���е������滻��
	 * String���replaceAll(����Ĺ����滻������ַ���)
	 */
	
	public static void replaceAll() {
		String str = "itstar12313213data123124124";
		
		str = str.replaceAll("[\\d]", "#");
		System.out.println(str);
	}
}
