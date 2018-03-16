package com.itstar.demo05;

import java.util.LinkedList;

/*
 * LinkedList 集合特有的功能
 *  自身的特点：链表的底层实现，查询慢，增删快
 *  
 * 特有的功能，不能用多态
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * E removeFirst()   删除链表头
	 *  E removeLast()   删除链表尾
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
                  返回此列表的第一个元素。 
 		E getLast() 
                  返回此列表的最后一个元素。 

	 */
	public static void function_2() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("aa");
		link.add("bb");
		link.add("cc");
		link.clear();//移除所有元素 清空
		
		if(link.size()!=0){
			String first = link.getFirst();
			String last = link.getLast();
			System.out.println(first);
			System.out.println(last);
		}
		
		
	}
	
	
	//顺序问题
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
		//按照顺序来 有序
		System.out.println(link);
		link.addFirst("haha");
		link.addLast("嘻嘻");
		System.out.println(link);
	}
}
