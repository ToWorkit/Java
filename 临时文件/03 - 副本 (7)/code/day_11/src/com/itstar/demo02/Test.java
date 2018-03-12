package com.itstar.demo02;

public class Test {
	public static void main(String[] args) {
		//创建person类的对象
		
		//1.构造空参的构造方法，创建对象
		Person p = new Person();
		p.setAge(18);
		p.setName("傻叉");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		Person p1 = new Person("张三",20);
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
	}
}
