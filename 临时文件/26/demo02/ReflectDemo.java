package com.itstar.demo02;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ���弯�ϣ�����
 * �淶����
 * String Integer �����������������
 * 
 * ����������
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception, Exception {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("���");
		//����ķ�ʽ
		Class c = array.getClass();
		
		//���� �õ�����add
		Method method = c.getMethod("add", Object.class);
		
		//���Ԫ�� �÷���
		method.invoke(array, 110);
		method.invoke(array, 119);
		method.invoke(array, 120);
		
		System.out.println(array);
		
	}
}
