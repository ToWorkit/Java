package com.itstar.demo01;
/*
 * 断点调试：debug一下
 */
public class Test {
	public static void main(String[] args) {
		//实例对象，调用空参的构造方法
		Person p = new Person("李四",18);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
