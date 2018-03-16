package com.itstar.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * JDK1.5之后出现的安全机制，保证程序的安全性
	 * 		泛型：指明集合存储元素的类型 <类型>
	 */
	
	public static void function() {
		
		// 加泛型是为了程序的安全性 ，只允许添加String
		// Collection<String> coll = new ArrayList<String>();
		
		
		Collection coll = new ArrayList<>();
		coll.add("abc");
		coll.add("bbc");
		// 发生了自动装箱，转为了 Integer 类型，不可以强转String，int类型是可以强转String的 -> 待查证
		coll.add(123);
		
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			// 上面发生了自动装箱，转为了 Integer 类型，不可以强转String，int类型是可以强转String的
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}
