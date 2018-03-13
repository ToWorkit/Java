package com.itstar.demo08;

public class Test {
	public static void main(String[] args) {
		//创建对象
		JavaEE ee = new JavaEE("喜洋洋","开发部007");
		ee.work();
		
		Net net = new Net("懒洋洋","运维008");
		net.work();
	}
}
