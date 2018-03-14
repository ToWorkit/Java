package com.itstar.demo01;

public class testEquals {
	public static void main(String[] args) {
		//创建对象
		Person p1 = new Person("张三",18);
		Person p2 = new Person("李四",18);
		
		boolean b = p1.equals(p1);
		System.out.println(b);
	}
}
