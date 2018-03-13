package com.itstar.demo03;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		z.show();
		
		//被final修饰 一次赋值 终身不变 final修饰的可以看做常量
		final int i = 2;
		//i= 10;不可以 i不能被改值
		//int j = i + 1;//并没有修改i的值
		System.out.println(i);
		
		//保存的是内存地址 这块地址不变
		final Zi z2 = new Zi();
		//z2 = new Zi();不可以 此时new地址就变量
	}
}
