package com.itstar.demo05;
/*
 * �������ˣ�
 * 	���ԣ����� ����
 *  ������˵��
 */
public class Person {
	private String name;
	private int age;
	
	//get���в��ü�this��Ϊû��ͬ������
	public String getName() {
		return name;
	}
	//��Ա����name age�ĸ�ֵ
	public void setName(String name) {
		this.name = name;//�����Ķ��ԡ� �Ѿֲ�������ֵ����Ա����
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		String name = "ŷ��";
		int age = 25;
		
		//System.out.println(this);
		System.out.println("����˵��"+this.name+"..."+this.age);
	}
	
}
