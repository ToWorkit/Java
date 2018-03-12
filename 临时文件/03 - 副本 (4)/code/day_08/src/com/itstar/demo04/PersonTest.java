package com.itstar.demo04;
/*
 * 创建对象，对象调用自定义类的属性和方法
 */
public class PersonTest {
	public static void main(String[] args) {
		//创建person类对象
		Person p = new Person();
		//对成员变量进行赋值
		p.setAge(20);
		p.name = "熊大";
		
		p.speak();
		
		System.out.println(p.getAge());
	}
}
