package com.itstar.demo01;

import java.lang.reflect.Field;

/*
 * ��������ȡ��Ա�����������޸�ֵ
 * Person���ԱString int
 */
public class ReflectDemo6 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		//��Ա�����Ļ�ȡgetFields() class�ļ��е����й��õĳ�Ա����
		//getDeclaredFields()˽�еĳ�Ա����Ҳ���õ�
//		Field[] fields = c.getFields();
//		for(Field f:fields) {
//			System.out.println(f);
//		}
		
		//��ȡ��Ա����String int
		//��ȡָ���ĳ�Ա����
		Field fied = c.getField("name");
		
		
		//���Ը�ֵ
		Object obj = c.newInstance();
		fied.set(obj, "����");
		System.out.println(obj);
	}
}
