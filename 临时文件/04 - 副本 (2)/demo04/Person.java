package com.itstar.demo04;
/*
 * final修饰成员变量的测试
 * final修饰的是成员变量，固定的不是内存的默认值
 * 固定的是，成员变量的手动赋值，绝对不是内存的赋值
 * 
 * 成员变量的赋值，2种实现方式：
 * 	1.定义的时候直接=赋值
 *  2.采用构造方法赋值
 *  保证：被final修饰的成员变量只能赋值一次
 *  
 */
public class Person {
	//final int age; 不可以
	final int age = 1;
	
//	public Person(int age) {
//		this.age = age;不可以
//	}
}
