package com.itstar.demo01;
/*
 * �Զ�����
 * 	String name
 *  int age
 */
public class Person {
	public String name;
	public int age;
	
//	static {
//		System.out.println("���Ǿ�̬�����");
//		
//	}
	
	public Person() {
		super();
		
	}
	
	public void eat() {
		System.out.println("���ڳԷ�");
	}
	
	public void sleep(String n,int a) {
		System.out.println("��˯��"+ n +"...."+a);
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
