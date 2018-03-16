package com.itstar.demo02;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * 存储int类型数据
		 * 集合本身不接受基本类,jdk自动装箱进行了存储
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
		 * 集合存储自定义类对象
		 */
		ArrayList<Person> arrayPer = new ArrayList<Person>();
		//添加元素
		arrayPer.add(new Person("李四",20));
		arrayPer.add(new Person("张三",18));
		arrayPer.add(new Person("小强",40));
		
		for(int i=0;i < arrayPer.size();i++) {
			System.out.println(arrayPer.get(i));
		}
		
	}
}
