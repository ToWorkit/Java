package com.itstar.demo01;
/*
 * 自定义类
 * 	String name
 *  int age
 */
public class Person {
	public String name;
	public int age;
	
//	static {
//		System.out.println("我是静态代码块");
//		
//	}
	
	public Person() {
		super();
		
	}
	
	public void eat() {
		System.out.println("人在吃饭");
	}
	
	public void sleep(String n,int a) {
		System.out.println("在睡觉"+ n +"...."+a);
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
