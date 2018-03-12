package com.itstar.demo07;
/*
 * 运算符比较运算符，结果真假值
 * 关键字： instanceof 以前 == > < ,比较引用数据类型的
 * 但是：Cat和Dog
 * 
 * 用法：
 * 		引用变量 instanceof 类名
 * 		p instanceof Student
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Teacher();
		Person s = new Student();
		//s.study();不可以 不能用子类的特有属性
		s.sleep();
		
		boolean b = p instanceof Teacher;
		System.out.println(b);
		
		
		//boolean b1 = p instanceof Animal;这样毫无意义 p与animal根本没有任何关系
	}
}
