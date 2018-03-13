package com.itstar.demo08;
/*
 * 多态的调用过程，编译看谁？运行看谁？
 * 编译都是看=左边的父类，父类有编译成功，如果没有编译失败
 * 运行，静态方法，运行父类当中的静态方法
 * 运行，非静态方法 ，运行子类的重写方法
 * 
 * ！成员变量，编译和运行全是父类
 */
public class Test {
	public static void main(String[] args) {
		//多态
		Fu f = new Zi();
		//1 
		System.out.println(f.a);
		
		//结果父类的show方法
		//调用的是父类的静态方法，原因：静态属于类 ，不属于对象
		//对象的多态性里面，静态和对象无关，父类的引用.静态方法
		f.show();
	}
}
