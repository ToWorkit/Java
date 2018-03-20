package com.itstar.demo01;

import java.lang.reflect.Method;

/*
 * 反射调用有参数的方法
 */
public class ReflectDemo8 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		
		Method method = c.getMethod("sleep", String.class,int.class);
		
		//System.out.println(method);
		//运行方法
		Object obj = c.newInstance();
		method.invoke(obj, "张三",14);
	}
}
