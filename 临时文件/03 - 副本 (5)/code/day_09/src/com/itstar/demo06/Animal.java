package com.itstar.demo06;

public abstract class Animal {
	public void sleep() {
		System.out.println("动物在睡觉");
		
	}
	//private abstract void show();不可以、原因，本来抽象类的存在就是让子类去重写抽象方法的
	public abstract void show();
}
