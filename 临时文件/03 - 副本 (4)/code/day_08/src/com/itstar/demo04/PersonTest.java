package com.itstar.demo04;
/*
 * �������󣬶�������Զ���������Ժͷ���
 */
public class PersonTest {
	public static void main(String[] args) {
		//����person�����
		Person p = new Person();
		//�Գ�Ա�������и�ֵ
		p.setAge(20);
		p.name = "�ܴ�";
		
		p.speak();
		
		System.out.println(p.getAge());
	}
}
