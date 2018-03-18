package com.itstar.demo04;

public class IntegerDemo1 {
	public static void main(String[] args) {
		function();
	}
	
	public static void function() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		
		
		//false 对象比较的地址 new的地址不同
		System.out.println(i == j);
		//true equals比较的是对象的数据 继承了Object类 重写了equals方法
		System.out.println(i.equals(j));
		
		
		System.out.println("===================");
		
		//false 原因发生了自动装箱
		Integer a = 300;
		Integer b = 300;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println("===================");
		
		//注意：数据在byte范围内 JVM不会重新New对象
		Integer c = 125;//Integer c = new Integer(127);
		Integer d = 125;//Integer c = new Integer(127);
		System.out.println(c == d);//true
	}
}
