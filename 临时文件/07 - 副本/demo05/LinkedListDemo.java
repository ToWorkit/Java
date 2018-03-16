package com.itstar.demo05;

import java.util.LinkedList;

/*
 * LinkedList �������еĹ���
 *  ������ص㣺����ĵײ�ʵ�֣���ѯ������ɾ��
 *  
 * ���еĹ��ܣ������ö�̬
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * E removeFirst()   ɾ������ͷ
	 *  E removeLast()   ɾ������β
    */
	public static void function_3() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("aa");
		link.add("bb");
		link.add("cc");
		
		String first = link.removeFirst();
		String last = link.removeLast();
		System.out.println(first);
		System.out.println(last);
		System.out.println(link);
		
	}
	
	/*
	 *  E getFirst() 
                  ���ش��б�ĵ�һ��Ԫ�ء� 
 		E getLast() 
                  ���ش��б�����һ��Ԫ�ء� 

	 */
	public static void function_2() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("aa");
		link.add("bb");
		link.add("cc");
		link.clear();//�Ƴ�����Ԫ�� ���
		
		if(link.size()!=0){
			String first = link.getFirst();
			String last = link.getLast();
			System.out.println(first);
			System.out.println(last);
		}
		
		
	}
	
	
	//˳������
	public static void function_1() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("aa");
		link.add("bb");
		link.add("cc");
		
		link.addLast("1");
		link.addLast("2");
		link.addLast("3");
		System.out.println(link);
	}
	
	/*
	 *  void addFirst(E e) 
	 *   void addLast(E e) 
	 */
	public static void function() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("aa");
		link.add("bb");
		link.add("cc");
		//����˳���� ����
		System.out.println(link);
		link.addFirst("haha");
		link.addLast("����");
		System.out.println(link);
	}
}
