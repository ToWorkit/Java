package com.itstar.demo06;
/*
 * 静态的注意事项：
 * 
 * 	在静态中不能调用非静态
 * 
 *  为什么？声明周期
 *  静态优先于飞静态存在于内存当中
 *  
 *  静态：注意-》静态不能写this,不能写super
 */
public class Student {
	private String name;
	private int age;
	
//	public static void function() {
//		System.out.println(age+name);不可以 在静态中不能调用非静态
//	}
	private static String id;
	private static double price;
	
	//非静态方法 可以用静态成员变量 原因：静态成员变量先进内存 可以直接拿来用，非静态属于对象
	public void function() {
		System.out.println(id+price);
	}
	
	public static void main() {
		method();
	}
	
	public static void method() {
		
	}
}
