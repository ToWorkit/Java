package com.itstar.demo01;

import java.lang.reflect.Method;

/*
 * 发射获取成员方法并且运行
 * 
 */
public class ReflectDemo7 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		// Method[] getMethods() 获取class文件所有的公共方法 包括继承的
		//Method[] methods = c.getMethods();
//		for(Method m:methods) {
//			System.out.println(m);
//		}
		 
		// Method getMethod(String name, Class<?>... parameterTypes)
		//获取指定方法 eat
		Method method = c.getMethod("eat");
		System.out.println(method);
		//运行获取到方法eat
		Object obj = c.newInstance();
		method.invoke(obj);
	}
}
