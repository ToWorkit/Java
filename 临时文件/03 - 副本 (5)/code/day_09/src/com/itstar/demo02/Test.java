package com.itstar.demo02;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		int i = z.a;
		System.out.println(i);
		
		//子类自己有的自然调用自己的，没有的调用父类的
		//方法的就近原则，不是覆盖
		z.show();
	}
}
