package com.itstar.demo01;

import java.lang.reflect.Constructor;

/*
 * ͨ�������ȡ�вι���
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		//getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class,int.class);
		// T newInstance() ����ʵ�ʲ���
		Object obj = con.newInstance("����",18);
		
		System.out.println(obj);
		 
	}
}
