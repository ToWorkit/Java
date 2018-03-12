package com.itstar.demo05;

public class Test {
	public static void main(String[] args) {
		//公式：父类的类型 变量 = new 子类的对象();
		Fu f = new Zi();
		//多态调用 子类的方法
		f.show();
		
		
		
		//多态的使用
		Animal a = new Cat();
		a.eat();
		
		
		//接口中的多态
		Smoking s = new Student();
		s.smoking();
	}
}
