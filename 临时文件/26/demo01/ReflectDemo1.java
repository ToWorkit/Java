package com.itstar.demo01;
/*
 * ��ȡclass�ļ������ַ�ʽ
 *  1.�����ȡ
 *  2.����.��ȡ
 *  3.Class��ľ�̬������ȡ
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.�����ȡ
		//Person p = new Person();
		//����Person��ķ���getClass��������ȡclass�ļ�
		//Class c = p.getClass();
		//System.out.println(c);
		
		//2.����.��ȡ
		Class c1 = Person.class;
		System.out.println(c1);
		
		// 3.Class��ľ�̬������ȡ
		//forName(String className) 
		
		Class c2 = Class.forName("com.itstar.demo01.Person");
		System.out.println(c2);
		
		//System.out.println(c == c1);//true �ڴ�  ��ļ�����ֻ�ᴴ��һ��
		//System.out.println(c.equals(c1));//true ����ֵ
		
	}
}
