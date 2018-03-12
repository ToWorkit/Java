package com.itstar.demo01;
/*
 * 定义类的实现接口，重写接口当中的抽象方法
 * 
 * 类实现接口，可以理解为继承
 * 
 * 关键字：implments 实现
 * class 类 implments 接口{
 * 		重写接口当中的抽象方法
 * }
 * 
 */
public class MyInterfaceImpl implements MyInterface{

	
	public void function() {
		System.out.println("实现类，重写的抽象方法");
	}
	
}
