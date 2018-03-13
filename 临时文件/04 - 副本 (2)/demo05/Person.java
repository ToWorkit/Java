package com.itstar.demo05;
/*
 * 定义Person类
 * 定义对象的特有数据，和对象的共享数据
 * 对象的特有数据(非静态修饰)		调用者只能new对象
 * 对象的共享数据(静态修饰)		调用者可以new对象，也可以类名调用
 *  
 */
public class Person {
	String name;//特有数据
	
	static String className;//共享数据
}
