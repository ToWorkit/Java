package com.itstar.demo02;

public class Test {
	public static void main(String[] args) {
		//����person��Ķ���
		
		//1.����ղεĹ��췽������������
		Person p = new Person();
		p.setAge(18);
		p.setName("ɵ��");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		Person p1 = new Person("����",20);
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
	}
}
