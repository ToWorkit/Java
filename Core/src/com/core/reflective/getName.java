package com.core.reflective;

import java.util.Random;

/**
 * ����
 * ����һ�������������Ҳ��Ϊ������һ����
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
		
		// ���þ�̬���� forName ��ȡ��������Ӧ�� Class ����
		String className = "java.util.Random";
		Class c2 = Class.forName(className);
		System.out.println(c2.getName());
		
		// ����ʹ��newInstance��̬����һ�����ʵ��
//		e.getClass().newInstance();
		
		// forName��newInstance�໥��ϣ������ø��ݴ洢���ַ����е���������һ������
		
		String s = "java.util.Random";
		Object m = Class.forName(s).newInstance();
		// java.util.Random@42a57993 ����
		System.out.println(m);
	}
}
