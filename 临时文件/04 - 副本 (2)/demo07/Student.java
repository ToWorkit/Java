package com.itstar.demo07;
/*
 * ���⣺static ��̬����ʲôʱ��ʹ�ã�Ӧ�ó���
 * 
 * 	static ���γ�Ա���� ���γ�Ա����
 *  ��Ա���� static ,���ݾ������������������
 *  	���������ʱ�򣬶������֮���Ƿ��й�������
 *  	���㽫���Ե����ݶ���Ϊ��̬�ĳ�Ա����
 *  
 *  ��Ա��������static�����ű�����
 *  	���������û�е��ù��Ǿ�̬��Ա������������Ϊ��̬
 */
public class Student {
	private static String name;
	private static int age;
	
	//�ǲ��Ǿ�̬���� ȡ�����õ��ǲ��Ǿ�̬����
	public static void function() {
		System.out.println(age+name);
	}
	
	private char sex;
	//������˷Ǿ�̬�����Ļ� �Ͳ��ܼӾ�̬��
	public void function_1() {
		System.out.println(age+name+sex);
	}
	//�Ա����ֱ��ͨ���������ô˷���
	public static int getSum(int a,int b,int c) {
		return a+b+c;
	}
}
