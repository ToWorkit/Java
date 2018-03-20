package com.itstar.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ͨ�������ȡclass�ļ��Ĺ��췽�������й��췽��
 * ���й��췽�� ��������
 * 	���䣺
 * 		��ȡclass�ļ�����
 * 		��class�ļ����л�ȡ��Ҫ�ĳ�Ա
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//��ȡclass�ļ�����
		Class c = Class.forName("com.itstar.demo01.Person");
		
		//���л�ȡperson���еĹ��췽��
		//Constructor<?>[] getConstructors() 
		//Constructor �������췽���Ķ�����
//		Constructor[] ct = c.getConstructors();
//		for(Constructor cf:ct) {
//			System.out.println(cf);
//		}
		
		//��ȡָ���Ĺ��췽�� �ղι���
		//getConstructor(Class<?>... parameterTypes) 
		Constructor con  =  c.getConstructor();
		//��ȡ���췽��
		Object obj = con.newInstance();
		System.out.println(obj);
		//���÷���
		Person p = (Person)obj;
		p.eat();
	}
}
