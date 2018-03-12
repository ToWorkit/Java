package com.itstar.demo02;
/*
 * 构造方法的重载
 */
public class Person {
	String name;
	int age;
	
	//写空参的构造方法
	public Person() {
		
	}
	
	//写有参的构造方法
	public Person(String name,int age) {
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
	
	
}
