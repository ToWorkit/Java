package com.itstar.demo03;

public class IntegerDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Integer��Ĺ��췽��
	 * 	Integer(String s) 
	 * �����ָ�ʽ���ַ������ݵ�Integer�Ĺ��췽����
	 * 
	 */
	public static void function_3() {
		Integer in = new Integer(5);
		int i = in.intValue();
		//System.out.println(i++);
		
	}
	
	/*
	 * ��ν�������������ת��Ϊ�ַ�����
	 * int -> String
	 * Integer�ķ��� toString()
	 */
	public static void function_2(){
		int a = 1;
		//���ӿմ�
		String s = a + "";
		//�κ������������ַ����������ӣ��������ַ���
		System.out.println(s+2);
		
		String s1 = Integer.toString(2);
		String s2 = Integer.toString(5, 2);
		System.out.println(s2+2);//1012
	}
	
	/*
	 * parseInt(String s, int radix)
	 * radix:���� ����
	 * parseInt:���н����ʮ����
	 * 
	 */
	public static void function_1() {
		int a = Integer.parseInt("A", 16);
		System.out.println(a);
	}
	
	/*
	 * Integer�൱�еķ�����parseInt(String s) ����ֵint(������������)
	 * Ҫ���ַ������������ָ�ʽ��
	 */
	public static void function() {
		//������ַ�����Ҫ��
		int a = Integer.parseInt("12");
		//ת��Ϊ��������֮����Խ�����ѧ����
		System.out.println(a/2);
	}
}
