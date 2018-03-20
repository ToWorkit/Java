package com.itstar.demo02;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 定义集合，泛型
 * 规范类型
 * String Integer 不可以添加其他类型
 * 
 * 反射可以添加
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception, Exception {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("你好");
		//反射的方式
		Class c = array.getClass();
		
		//解刨 拿到方法add
		Method method = c.getMethod("add", Object.class);
		
		//添加元素 用方法
		method.invoke(array, 110);
		method.invoke(array, 119);
		method.invoke(array, 120);
		
		System.out.println(array);
		
	}
}
