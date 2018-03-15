package com.itstar.demo03;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * date类方法setTime(long ) 传递毫秒值
	 * 将日期对象，设置到指定的毫秒值上
	 * 毫秒值转换成了日期对象
	 */
	public static void function_3() {
		Date d = new Date();
		System.out.println(d);
		
		d.setTime(0);
		System.out.println(d);
	}
	
	/*
	 * date类的方法
	 * 返回的是毫秒值
	 * 将date表示的日期对象转换为毫秒值
	 * 
	 * 日期和毫秒值的转换
	 */
	public static void function_2() {
		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);
	}
	
	/*
	 * date类的long参数构造方法
	 * Date(long ) 表示的毫秒值
	 * 传递就是毫秒值，将毫秒值转换为日期的对象
	 */
	public static void function_1() {
		Date d = new Date(0);
		System.out.println(d);
	}
	
	/*
	 * date类的空参构造方法
	 */
	public static void function() {
		Date d = new Date();
		
		System.out.println(d);
	}
}
