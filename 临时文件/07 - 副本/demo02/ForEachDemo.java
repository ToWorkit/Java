package com.itstar.demo02;

import java.util.ArrayList;

/*
 * JDK1.5�����ԣ���ǿforѭ��
 * Collection �̳���Iterator
 * Iterator���ã�ʵ����ǿforѭ��
 * 
 * ��ʽ��for(��������  ��������������߼���){
 * 			sop(����);
 * 		}
 * 
 *�ô����������ˣ������˶��������б���
 *�׶ˣ�û�����������ܲ����������е�Ԫ��
 */
public class ForEachDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * ��ǿforѭ����������
	 * �洢�Զ�����Person
	 */
	public static void function_2() {
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(new Person("����",18));
		array.add(new Person("����", 20));
		array.add(new Person("����",33));
		
		for(Person p:array) {
			System.out.println(p);
		}
	}
	
	public static void function_1() {
		String[] str = {"aaa","bbb","ccc"};
		for(String s:str) {
			System.out.println(s.length());
		}
	}
	
	/*
	 * ʵ��forѭ����������
	 * 
	 */
	public static void function() {
		int[] arr = {1,3,4,6,12,15,18};
		for(int a:arr) {
			System.out.println(a);
		}
	}
}
