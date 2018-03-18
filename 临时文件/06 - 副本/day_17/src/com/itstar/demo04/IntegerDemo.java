package com.itstar.demo04;
/*
 * JDK1.5之后的特性
 * 自动装箱：基本数据类型，直接变成对象
 * 
 * 自动拆箱：对象中的数据变回基本数据类型
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * 弊端：出现空指针异常
	 */
	public static void function_1() {
		Integer i = null;
		//拆箱 i = i.intValue() + 1 null能调用方法吗？不能
		i = i + 1;
		System.out.println(i);
	}
	
	/*
	 * 自动装箱与拆箱的好处：省代码，基本类型和引用类型直接计算
	 */
	public static void function() {
		//引用类型 引用变量指向对象
		//自动装箱 直接把基本数据类型5 变成了对象
		Integer i = 5;//Integer i = new Integer(5);
		System.out.println(i.toString());
		
		//引用数据类型能运算吗？出现了自动拆箱-》把引用类型转换为基本类型
		i = i + 1;
		System.out.println(i);
	}
	/*
	 * 自动装箱的好处：
	 * 	ArrayList<Integer> arr = new ArrayList<Integer>();
	 * arr.add(1); 添加的是基本数据类型，发生自动装箱
	 */
}
