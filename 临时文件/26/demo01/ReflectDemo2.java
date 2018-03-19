package com.itstar.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过反射获取class文件的构造方法，运行构造方法
 * 运行构造方法 创建对象
 * 	反射：
 * 		获取class文件对象
 * 		从class文件当中获取需要的成员
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获取class文件对象
		Class c = Class.forName("com.itstar.demo01.Person");
		
		//从中获取person类中的构造方法
		//Constructor<?>[] getConstructors() 
		//Constructor 描述构造方法的对象类
//		Constructor[] ct = c.getConstructors();
//		for(Constructor cf:ct) {
//			System.out.println(cf);
//		}
		
		//获取指定的构造方法 空参构造
		//getConstructor(Class<?>... parameterTypes) 
		Constructor con  =  c.getConstructor();
		//获取构造方法
		Object obj = con.newInstance();
		System.out.println(obj);
		//调用方法
		Person p = (Person)obj;
		p.eat();
	}
}
