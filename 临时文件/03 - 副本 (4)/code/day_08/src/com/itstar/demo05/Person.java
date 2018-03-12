package com.itstar.demo05;
/*
 * 类描述人：
 * 	属性：姓名 年龄
 *  方法：说话
 */
public class Person {
	private String name;
	private int age;
	
	//get当中不用加this因为没有同名变量
	public String getName() {
		return name;
	}
	//成员变量name age的赋值
	public void setName(String name) {
		this.name = name;//增加阅读性。 把局部变量赋值给成员变量
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		String name = "欧文";
		int age = 25;
		
		//System.out.println(this);
		System.out.println("人在说话"+this.name+"..."+this.age);
	}
	
}
