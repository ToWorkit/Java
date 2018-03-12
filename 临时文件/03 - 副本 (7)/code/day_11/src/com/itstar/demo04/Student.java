package com.itstar.demo04;
/*
 * 子类中,super()的方式，调用父类的构造方法
 * super()调用的是空参的构造方法
 * super(参数) 调用的是父类的有参构造方法
 * 
 * 注意：
 * 		子类构造方法第一行，有一个隐式代码super()
 * public Student(){
 * 	super();
 * }
 */
public class Student extends Person{
	public Student() {
		//走到父类中的构造器
		super("张三",18);
	}
}
