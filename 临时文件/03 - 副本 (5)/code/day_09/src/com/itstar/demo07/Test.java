package com.itstar.demo07;

public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		NetWork nt = new NetWork();
		
		ee.setId("研发1号小弟");
		ee.setName("熊大");
		
		nt.setId("运维1号小弟");
		nt.setName("熊二");
		
		ee.work();
		nt.work();
	}
}
