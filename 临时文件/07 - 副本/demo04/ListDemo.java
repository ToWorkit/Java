package com.itstar.demo04;

import java.util.ArrayList;
import java.util.List;

/*
 * List�ӿ���ϵ���̳�Collection�ӿ�
 *  �����кܶ�ʵ����
 *  List�ӿ��ص㣺�������������ظ�Ԫ��
 *   ʵ���ࣺArrayList  LinkedList
 *   
 *  
 */
public class ListDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 *  E set(int index, E element) 
	 *  �޸�ָ�������ϵ�Ԫ��
	 *  ����֮ǰ�޸ĵ�Ԫ��
	 */
	public static void function_2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Integer i = list.set(1, 22);
		System.out.println(i);
		System.out.println(list);
	}
	
	/*
	 * E remove(int index)
	 * �Ƴ�ָ�������ϵ�Ԫ��
	 * ���ر�ɾ��֮ǰ��Ԫ��
	 */
	public static void function_1() {
		List<Double> list = new ArrayList<>();
		list.add(1.1);
		list.add(2.2);
		list.add(3.3);
		
		Double d = list.remove(0);
		System.out.println(d);
		System.out.println(list);
	}
	
	/*
	 * void add(int index, E element) 
	 * ��Ԫ�ز��뵽�б��ָ��������
	 */
	public static void function() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		list.add(1, "123");
		System.out.println(list);
	}
}	
