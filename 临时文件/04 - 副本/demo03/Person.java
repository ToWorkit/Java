package com.itstar.demo03;
/*
 * this�����ڹ��췽��֮����е���
 * this.�ķ�ʽ,���ֳ�Ա������ֲ�����֮����������
 * this�ڹ��췽��֮��ĵ��ã��﷨this()
 */
public class Person {
	String name;
	int age;
	
	public Person() {
		name = "����";
		age = 20;
		
		//�������ģ�20 ���ݸ��˱���name age
		//this("����",20);this�����ã���һ�����췽���У���������һ�����췽��
		//ע�⣺this���ù��췽����ʱ��Ҫ�ڵ�һ��
		
	}
	
	//���췽����Ŀ�ľ�����new��ʱ�����ֱ��Ϊ��ĳ�Ա������ֵ
	public Person(String name,int age) {
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
	
	
	
}
