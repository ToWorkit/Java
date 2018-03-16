package com.itstar.demo04;

import java.util.ArrayList;
import java.util.List;

/*
 * List接口派系，继承Collection接口
 *  下面有很多实现类
 *  List接口特点：有序、索引、可重复元素
 *   实现类：ArrayList  LinkedList
 *   
 *  
 */
public class ListDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 *  E set(int index, E element) 
	 *  修改指定索引上的元素
	 *  返回之前修改的元素
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
	 * 移除指定索引上的元素
	 * 返回被删除之前的元素
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
	 * 将元素插入到列表的指定索引上
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
