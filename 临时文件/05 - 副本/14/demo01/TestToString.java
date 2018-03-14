package com.itstar.demo01;

public class TestToString {
	public static void main(String[] args) {
		Person p = new Person("哈哈",18);
		String s = p.toString();
		
		//对象 默认会调用toString方法
		System.out.println(p);
		System.out.println(s);
	}
}
