package com.itstar.demo01;

import java.util.Calendar;

public class Calendar2 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * Calendar类的set方法 设置日历set(int field,int value);
	 * field:字段
	 * value:具体值
	 * set(int year, int month, int date) 传递的是3个整数：年 月 日
	 */
	public static void function_1() {
		Calendar c = Calendar.getInstance();
		//c.set(Calendar.MONTH, 1);
		//设置
		c.set(2018, 3, 28);
		//获取年份
		int year = c.get(Calendar.YEAR);
		
		//获取月份
		int month = c.get(Calendar.MONTH) + 1;
		
		//获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println(year + "年" + month + "月" + day + "日");
	}
	
	/*
	 * Calendar类的get方法 获取日历字段的值 int get(int)
	 * 获取日历的字段 返回值是int 反悔的是具体日历值
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		//获取年份
		int year = c.get(Calendar.YEAR);
		//获取月份
		int month = c.get(Calendar.MONTH) + 1;
		//获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"年"+month+"月"+day+"日");
	}
}
