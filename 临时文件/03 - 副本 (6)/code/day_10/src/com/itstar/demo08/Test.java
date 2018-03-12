package com.itstar.demo08;

public class Test {
	public static void main(String[] args) {
		//两个子类，使用两次多态调用
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		//a1与a2调用的是子类和父类共有的方法，运行走的子类重写的方法
		a1.eat();
		a2.eat();
		
		//类型的向下转型Animal->Cat
		Cat c = (Cat)a1;
		c.catchMouse();
		//可以编译成功 但是运行失败
//		Cat d = (Cat)a2;
//		d.catchMouse();
		
		//为了防止异常的放生：a1属于Cat对象 a2属于Dog对象 强转
		//instanceof判断
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}
		if(a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
			
		}
		
		
	}
}
