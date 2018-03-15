package com.itstar.demo04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	/*
	 * 对日期进行格式化
	 *  SimpleDateFormat ：即有父类的方法 也重写了父类的抽象方法
	 */
	public static void main(String[] args) {
		function();
	}
	/*
	 * 日期模式：
	 * 	yyyy 年份
	 *  MM 月份
	 *  dd 月中的天数
	 *  HH 0-23小时
	 *  mm 小时当中的分钟
	 *  ss 秒
	 */
	public static void function() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
}
