package com.itstar.demo04;

public class IntegerDemo1 {
	public static void main(String[] args) {
		function();
	}
	
	public static void function() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		
		
		//false ����Ƚϵĵ�ַ new�ĵ�ַ��ͬ
		System.out.println(i == j);
		//true equals�Ƚϵ��Ƕ�������� �̳���Object�� ��д��equals����
		System.out.println(i.equals(j));
		
		
		System.out.println("===================");
		
		//false ԭ�������Զ�װ��
		Integer a = 300;
		Integer b = 300;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println("===================");
		
		//ע�⣺������byte��Χ�� JVM��������New����
		Integer c = 125;//Integer c = new Integer(127);
		Integer d = 125;//Integer c = new Integer(127);
		System.out.println(c == d);//true
	}
}
