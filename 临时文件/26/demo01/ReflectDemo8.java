package com.itstar.demo01;

import java.lang.reflect.Method;

/*
 * ��������в����ķ���
 */
public class ReflectDemo8 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		
		Method method = c.getMethod("sleep", String.class,int.class);
		
		//System.out.println(method);
		//���з���
		Object obj = c.newInstance();
		method.invoke(obj, "����",14);
	}
}
