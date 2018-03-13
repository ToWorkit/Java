package com.itstar.demo10;

import java.util.Scanner;

/*
 * 匿名对象
 */
public class Test {
	public static void main(String[] args) {
		//正常写法
		Person p = new Person();
		p.eat();
		
		//匿名写法
		new Person().eat();
		//两个不同的人在吃
		new Person().eat();
//只能使用一次	
//		int i = new Scanner(System.in).nextInt();
//		System.out.println(i);
		
		//可以使用多次
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.next();
		
		//匿名对象可以直接作为参数传递
		method(new Person());
		
		//调用空参方法
		Person p1 = new Person();
		p1.eat();
		
		new Person().eat();
		
	}
	//方法返回的是Person类型
	//return返回的是这个类的对象
	public static Person method() {
//		Person p = new Person();
//		return p;
		return new Person();
	}
	
	public static void method(Person p) {
		p.eat();
	}
	
}
