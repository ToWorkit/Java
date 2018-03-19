package com.itstaredu.demo16;
/*
 * 静态代码块，只执行一次
 * 构造代码块，new一次就执行一次，优先于构造方法
 * 构造方法,new一次就执行一次
 */
public class Test {
	public static void main(String[] args) {
		{
		int a = 1;
		System.out.println(a);
		}
		//System.out.println(a);代码块限制作用域，生命周期。
		
		//构造代码块先打印出来（构造代码块先运行），静态代码块优先代码块先执行
		Person p = new Person("张三", 15);
		Person p2 = new Person("李四",22);
	}
}
