package com.itstar.demo01;

public class TestToString {
	public static void main(String[] args) {
		Person p = new Person("����",18);
		String s = p.toString();
		
		//���� Ĭ�ϻ����toString����
		System.out.println(p);
		System.out.println(s);
	}
}
