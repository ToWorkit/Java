package com.itstar.demo01;

import java.lang.reflect.Constructor;

/*
 * 通过反射获取有参构造
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		//getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class,int.class);
		// T newInstance() 传递实际参数
		Object obj = con.newInstance("张三",18);
		
		System.out.println(obj);
		 
	}
}
