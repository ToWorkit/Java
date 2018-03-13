package com.itstar.demo04;

public class Person {
	int a = 1;
	String name;
	int age;
	
	
	
	
	public Person() {
		System.out.println("父类的构造方法");
		//如果构造方法中有变量 走构造 
		a = 4;
	}
	
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
		System.out.println("父类的有参构造方法");
	}
}
