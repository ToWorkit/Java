package com.itstar.demo03;

import java.util.ArrayList;

/*
 * 带有泛型的类
 * 		ArrayList<E>
 * E:Element 元素，变量
 * ArrayList<Integer>,E接收的就是Integer类型
 * 
 * public class ArrayList<E>{
 * 	
 * }
 * 
 */
public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(123);
		array.add(345);
		
		//ArrayList集合有自己的方法
		//<T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
		//集合变为数组
		Integer[] j = array.toArray(i);
		for(Integer z:j) {
			System.out.println(z);
		}
	}
}
