package com.itstar.demo03;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		//子类中没有show方法，自然去父类当中找
		z.show();
		z.show2();
	}
}
