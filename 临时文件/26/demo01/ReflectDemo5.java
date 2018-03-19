package com.itstar.demo01;

import java.lang.reflect.Constructor;

/*
 * 反射获取私有的构造方法运行
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		// Constructor<?>[] getDeclaredConstructors()  
		//获取所有的构造方法
//		Constructor[] con = c.getDeclaredConstructors();
//		for(Constructor co:con) {
//			System.out.println(co);
//		}

		// Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		
		//暴力反射 取消运行时权限检查 不推荐 破坏了程序的封装性 ，安全性
		con.setAccessible(true);
		Object obj = con.newInstance("张三",15);
		System.out.println(obj);
	}
}
