package com.itstar.demo02;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * �洢int��������
		 * ���ϱ������ܻ�����,jdk�Զ�װ������˴洢
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
		for(int i=0;i < array.size();i++) {
			System.out.println(array.get(i));
		}
		
		/*
		 * ���ϴ洢�Զ��������
		 */
		ArrayList<Person> arrayPer = new ArrayList<Person>();
		//���Ԫ��
		arrayPer.add(new Person("����",20));
		arrayPer.add(new Person("����",18));
		arrayPer.add(new Person("Сǿ",40));
		
		for(int i=0;i < arrayPer.size();i++) {
			System.out.println(arrayPer.get(i));
		}
		
	}
}
