package com.itstar.demo04;

public class Person {
	int a = 1;
	String name;
	int age;
	
	
	
	
	public Person() {
		System.out.println("����Ĺ��췽��");
		//������췽�����б��� �߹��� 
		a = 4;
	}
	
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
		System.out.println("������вι��췽��");
	}
}
