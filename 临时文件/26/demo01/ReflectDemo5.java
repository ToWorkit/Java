package com.itstar.demo01;

import java.lang.reflect.Constructor;

/*
 * �����ȡ˽�еĹ��췽������
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		// Constructor<?>[] getDeclaredConstructors()  
		//��ȡ���еĹ��췽��
//		Constructor[] con = c.getDeclaredConstructors();
//		for(Constructor co:con) {
//			System.out.println(co);
//		}

		// Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		
		//�������� ȡ������ʱȨ�޼�� ���Ƽ� �ƻ��˳���ķ�װ�� ����ȫ��
		con.setAccessible(true);
		Object obj = con.newInstance("����",15);
		System.out.println(obj);
	}
}
