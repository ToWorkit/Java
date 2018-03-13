package com.itstar.demo05;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "美羊羊";
		p2.name = "懒洋洋";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p1.className = "基础班";
		
		//静态变量 可以直接用类名来进行调用
		System.out.println(Person.className);
	}
}
