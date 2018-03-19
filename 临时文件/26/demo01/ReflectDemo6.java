package com.itstar.demo01;

import java.lang.reflect.Field;

/*
 * 反射来获取成员变量，并且修改值
 * Person类成员String int
 */
public class ReflectDemo6 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		//成员变量的获取getFields() class文件中的所有公用的成员变量
		//getDeclaredFields()私有的成员变量也能拿到
//		Field[] fields = c.getFields();
//		for(Field f:fields) {
//			System.out.println(f);
//		}
		
		//获取成员变量String int
		//获取指定的成员变量
		Field fied = c.getField("name");
		
		
		//属性赋值
		Object obj = c.newInstance();
		fied.set(obj, "张三");
		System.out.println(obj);
	}
}
