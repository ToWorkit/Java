package com.itstar.demo03;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection�Ǽ�������ʵ�������ӵ�еķ���
 * 
 * ArrayList implements List
 * List extends Collection
 * ������ִ�У�����ʵ�ֵ���д
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 *  boolean remove(Object o) 
	 *  �Ƴ����ϵ�ָ��Ԫ��
	 */
	public static void function_3() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itstar");
		coll.add("com");
		System.out.println(coll);
		coll.remove("itstar");
		System.out.println(coll);
	}
	
	/*
	 *  Object[] toArray() �����е�Ԫ�أ�����ת������
	 */
	
	public static void function_2() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itstar");
		coll.add("com");
		
		//ת������ ������
		Object[] objs = coll.toArray();
		for(int i = 0;i < objs.length;i++) {
			System.out.println(objs[i]);
		}
	}
	
	/*
	 *  boolean contains(Object o) �ж϶����Ƿ���ڼ����У����ڷ���true
	 *  ������Object
	 */
	public static void function_1() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itstar");
		coll.add("arry");
		coll.add("hunter");
		//���Ͳ�ͬ ���ص�Ҳ��false
		boolean b = coll.contains(123);
		System.out.println(b);
	}
	
	/*
	 * Collection�ӿڵķ���
	 *  void clear()  ��ռ��ϵ��е�����Ԫ��
	 *  
	 * ����������Ȼ��
	 */
	
	public static void function() {
		//�ӿ��еĶ�̬��ʽ����
		Collection<String> coll = new ArrayList<String>();
		
		coll.add("����");
		coll.add("���");
		coll.add("����");
		
		System.out.println(coll);
		
		coll.clear();
		System.out.println(coll);
		
		coll.add("����");
		System.out.println(coll);
	}
}
