package com.itstar.demo03;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * date�෽��setTime(long ) ���ݺ���ֵ
	 * �����ڶ������õ�ָ���ĺ���ֵ��
	 * ����ֵת���������ڶ���
	 */
	public static void function_3() {
		Date d = new Date();
		System.out.println(d);
		
		d.setTime(0);
		System.out.println(d);
	}
	
	/*
	 * date��ķ���
	 * ���ص��Ǻ���ֵ
	 * ��date��ʾ�����ڶ���ת��Ϊ����ֵ
	 * 
	 * ���ںͺ���ֵ��ת��
	 */
	public static void function_2() {
		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);
	}
	
	/*
	 * date���long�������췽��
	 * Date(long ) ��ʾ�ĺ���ֵ
	 * ���ݾ��Ǻ���ֵ��������ֵת��Ϊ���ڵĶ���
	 */
	public static void function_1() {
		Date d = new Date(0);
		System.out.println(d);
	}
	
	/*
	 * date��Ŀղι��췽��
	 */
	public static void function() {
		Date d = new Date();
		
		System.out.println(d);
	}
}
