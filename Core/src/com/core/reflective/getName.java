package com.core.reflective;

import java.util.Random;

/**
 * 反射
 * 类在一个包里，包的名字也作为类名的一部分
 */
public class getName {
	public static void main(String[] args) throws Exception {
		Random generator = new Random();
		Class c1 = generator.getClass();
		// java.util.Random
		String name = c1.getName();

		System.out.println(name);
		// class java.util.Random
		System.out.println(c1);
		
		// 调用静态方法 forName 获取到类名对应的 Class 对象
		String className = "java.util.Random";
		Class c2 = Class.forName(className);
		System.out.println(c2.getName());
		
		// 可以使用newInstance动态创建一个类的实例
//		e.getClass().newInstance();
		
		// forName和newInstance相互配合，可以用根据存储在字符串中的类名创建一个对象
		
		String s = "java.util.Random";
		Object m = Class.forName(s).newInstance();
		// java.util.Random@42a57993 对象
		System.out.println(m);
	}
}
