package com.itstar.demo01;

public class Car {
	//car的组成部分：属性和方法
	//需要驾驶它
	
	//颜色
	String color;
	//轮子
	int count;
	
	//定义跑的功能
	public  void run() {
		System.out.println("小汽车正在跑"+"..." + color + "..." + count);
	}
}
