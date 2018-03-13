package com.itstar.demo06;
/*
 * 构造方法的第一行写this();还是super();
 * 不能同时存在，任选其一。保证子类的所有构造方法可以调用父类的构造方法即可
 * 
 * 结论：无论如何，子类的所有构造方法，直接、间接调用到父类的构造方法
 * 		子类的构造方法，什么都不写，默认构造方法的第一行就是super();
 * 
 */
public class Student extends Person{
//	public Student() {
//		//super();
//		this(); this调用的是本类当中的构造方法
//	}
	
	public Student() {
		//可以调用下面的构造方法
		this("aaa");
	}
	
	public Student(String s) {
		super(2);
	}
}
