package com.itstar.demo01;
/*
 * �Զ����person�࣬��Ա����,name age
 * Ҫ����new person��ͬʱָ����name��age��ֵ
 * ʵ�ֹ��� ��ҽ�÷���ȥʵ�֣����췽��
 * ���ã���new��ͬʱ�Գ�Ա������ֵ �Զ����ʼ����ʱ���new Person��age name��ֵ
 * 
 * ���췽���Ķ����ʽ
 * 		Ȩ�� ������(�����б�){
 * 		}
 */
public class Person {
	private String name;
	private int age;
	
	//�������췽��
	public Person(String name,int age) {
		//System.out.println("����һ���ղεĹ��췽��");
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
