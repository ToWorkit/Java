package com.itstar.demo10;

import java.util.Scanner;

/*
 * ��������
 */
public class Test {
	public static void main(String[] args) {
		//����д��
		Person p = new Person();
		p.eat();
		
		//����д��
		new Person().eat();
		//������ͬ�����ڳ�
		new Person().eat();
//ֻ��ʹ��һ��	
//		int i = new Scanner(System.in).nextInt();
//		System.out.println(i);
		
		//����ʹ�ö��
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.next();
		
		//�����������ֱ����Ϊ��������
		method(new Person());
		
		//���ÿղη���
		Person p1 = new Person();
		p1.eat();
		
		new Person().eat();
		
	}
	//�������ص���Person����
	//return���ص��������Ķ���
	public static Person method() {
//		Person p = new Person();
//		return p;
		return new Person();
	}
	
	public static void method(Person p) {
		p.eat();
	}
	
}
