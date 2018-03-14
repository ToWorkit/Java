package com.itstar.demo02;

public class StringDemo02 {
	public static void main(String[] args) {
		
		String str1 = new String("abcd");
		String str2 = "abcd";
		System.out.println(str1);
		System.out.println(str2);
		
		//引用数据类型，比较的是内存地址
		System.out.println(str1 == str2);//false
		//String类中重写了equals方法 
		System.out.println(str1.equals(str2));//true
	}
}
