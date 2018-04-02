package demo05;

/*
 * 日历类：java.util.Calendar
 * 	抽象类，使用它的子类对象
 *  
 *  Calendar类使用了静态方法getInstance() 直接返回子类对象
 *  不需要new子类对象 通过静态方法直接获取
 */

import java.util.Calendar;

public class Calendar_01 {
	public static void main(String[] args) {
		calendar_1();
		calendar_2();
	}
	

	/**
	 * Calendar类的get方法，返回日历字段的值 int get(int)
	 * 获取日历的字段，返回值是int，具体的日历值
	 */
	public static void calendar_1() {
		Calendar c = Calendar.getInstance();
		// 获取年份
		int y = c.get(Calendar.YEAR);
		// 获取月份
		int m = c.get(Calendar.MONTH) + 1;
		// 获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(y + "-" + m + "-" + day);
	}
	
	
	/*
	 * Calendar类的set方法 设置日历set(int field,int value);
	 * field:字段
	 * value:具体值
	 * set(int year, int month, int date) 传递的是3个整数：年 月 日
	 */
	
	public static void calendar_2() {
		Calendar c = Calendar.getInstance();
		// 设置(注意月份)
		c.set(2018, 2, 20);
		//获取年份
		int year = c.get(Calendar.YEAR);
		
		//获取月份
		int month = c.get(Calendar.MONTH) + 1;
		
		//获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "-" + month + "-" + day);
	}
}
