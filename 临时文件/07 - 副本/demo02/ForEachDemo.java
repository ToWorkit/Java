package com.itstar.demo02;

import java.util.ArrayList;

/*
 * JDK1.5新特性，增强for循环
 * Collection 继承了Iterator
 * Iterator作用，实现增强for循环
 * 
 * 格式：for(数据类型  变量名：数组或者集合){
 * 			sop(变量);
 * 		}
 * 
 *好处：代码少了，发变了对容器进行遍历
 *弊端：没有索引，不能操作容器当中的元素
 */
public class ForEachDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * 增强for循环遍历集合
	 * 存储自定义类Person
	 */
	public static void function_2() {
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(new Person("张三",18));
		array.add(new Person("李四", 20));
		array.add(new Person("王五",33));
		
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
	 * 实现for循环遍历数组
	 * 
	 */
	public static void function() {
		int[] arr = {1,3,4,6,12,15,18};
		for(int a:arr) {
			System.out.println(a);
		}
	}
}
