package com.itstar.demo01;
/*
 * 反射获取构造方法并运行，快捷点的方式
 * 前提条件：
 * 	被反射的类，必须有空参构造
 *  构造方法不能是私有的
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
