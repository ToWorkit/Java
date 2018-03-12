package com.itstar.demo02;

public class Zi extends Fu{
	int a = 2;
	
	public void show() {
		int a = 3;
		//System.out.println(a);
		//this可以调用成员变量
		//System.out.println(this.a);
		
		//调用的既不是成员变量也不是方法当中的变量，而是父类当中的变量
		System.out.println(super.a);
	}
}
