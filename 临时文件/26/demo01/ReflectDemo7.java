package com.itstar.demo01;

import java.lang.reflect.Method;

/*
 * �����ȡ��Ա������������
 * 
 */
public class ReflectDemo7 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		// Method[] getMethods() ��ȡclass�ļ����еĹ������� �����̳е�
		//Method[] methods = c.getMethods();
//		for(Method m:methods) {
//			System.out.println(m);
//		}
		 
		// Method getMethod(String name, Class<?>... parameterTypes)
		//��ȡָ������ eat
		Method method = c.getMethod("eat");
		System.out.println(method);
		//���л�ȡ������eat
		Object obj = c.newInstance();
		method.invoke(obj);
	}
}
