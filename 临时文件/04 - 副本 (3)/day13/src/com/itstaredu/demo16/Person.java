package com.itstaredu.demo16;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
		System.out.println("我是构造方法");
	}
	//构造代码块
	{
		
		System.out.println("我是构造代码块");
	}
	
	//静态代码块
	static {
		System.out.println("我是静态代码块");
	}
}
