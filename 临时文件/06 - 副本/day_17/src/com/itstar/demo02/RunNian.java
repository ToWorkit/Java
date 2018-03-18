package com.itstar.demo02;

import java.util.Calendar;

public class RunNian {
	public static void main(String[] args) {
		function();
	}
	
	/*
	 * 闰年计算的高级算法：
	 * 	判断 2000 3000
	 * 日历类设置指定的年份的3月1日 add先前偏移一天，获取的天数是29天就是闰年 28不是
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		//设置时间 美国0-11月
		c.set(2000, 2, 1);
		//日历add方法向前偏移一天
		c.add(Calendar.DAY_OF_MONTH, -1);
		//用get方法来获得天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
