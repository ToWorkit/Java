package com.itstar.demo01;
/*
 * �����ȡ���췽�������У���ݵ�ķ�ʽ
 * ǰ��������
 * 	��������࣬�����пղι���
 *  ���췽��������˽�е�
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itstar.demo01.Person");
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
