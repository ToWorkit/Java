package com.itstar.demo05;

public class Test {
	public static void main(String[] args) {
		//父类为抽象类 所以没有办法实例化
		JavaEE e = new JavaEE();
		e.work();
		
		Android a = new Android();
		a.work();
	}
}
