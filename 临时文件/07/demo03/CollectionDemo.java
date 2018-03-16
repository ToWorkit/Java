package com.itstar.demo03;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection是集合所有实现类必须拥有的方法
 * 
 * ArrayList implements List
 * List extends Collection
 * 方法的执行，都是实现的重写
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 *  boolean remove(Object o) 
	 *  移除集合的指定元素
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
	 *  Object[] toArray() 集合中的元素，集合转成数组
	 */
	
	public static void function_2() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itstar");
		coll.add("com");
		
		//转成数组 定长了
		Object[] objs = coll.toArray();
		for(int i = 0;i < objs.length;i++) {
			System.out.println(objs[i]);
		}
	}
	
	/*
	 *  boolean contains(Object o) 判断对象是否存在集合中，存在返回true
	 *  参数是Object
	 */
	public static void function_1() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itstar");
		coll.add("arry");
		coll.add("hunter");
		//类型不同 返回的也是false
		boolean b = coll.contains(123);
		System.out.println(b);
	}
	
	/*
	 * Collection接口的方法
	 *  void clear()  清空集合当中的所有元素
	 *  
	 * 集合容器依然在
	 */
	
	public static void function() {
		//接口中的多态方式调用
		Collection<String> coll = new ArrayList<String>();
		
		coll.add("您好");
		coll.add("你好");
		coll.add("尔好");
		
		System.out.println(coll);
		
		coll.clear();
		System.out.println(coll);
		
		coll.add("哈哈");
		System.out.println(coll);
	}
}
