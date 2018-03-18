package com.itstar.demo01;

import java.util.Calendar;

/*
 * 日历类：java.util.Calendar
 * 	抽象类，使用它的子类对象
 *  
 *  Calendar类谢了静态方法getInstance() 直接返回子类对象
 *  不需要new子类对象 通过静态方法直接获取
 */
public class Calendar1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
	}
}
