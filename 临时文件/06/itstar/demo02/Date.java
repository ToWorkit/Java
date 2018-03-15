package com.itstar.demo02;

public class Date {
	/*
	 * date类的使用
	 * 	java.util.Date
	 * 
	 * 毫秒的概念：
	 *  1000毫秒=1秒
	 * 1520258586367 返回值long类型(int装不下)
	 * 
	 * 时间原点：公元1970年1月1日 午夜0:00:00 毫秒值是0
	 * 
	 * 重要：时间和日期的计算必须依赖毫秒值，由于毫秒值可以在日期方面的数学计算，
	 * 时间日期是 不能计算的  2018/3/5
	 * 
	 * 计算机系统中底层都是以毫秒值进行计算的
	 */
	
	public static void main(String[] args) {
		//获取当前日期的毫秒值
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
}
