package com.itstar.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws Exception {
		function();
	}
	
	/*
	 * 计算活了多少天
	 * 		生日与今天的日期
	 * 		两个日期变成毫秒值，减法
	 */
	public static void function() throws Exception {
		System.out.println("请输入你的出生日期 格式yyyy-MM-dd");
		//获取出生日期，键盘输入
		String birthday = new Scanner(System.in).next();
		
		//将字符串转换成日期对象
		//创建SimpleDateFormat对象，写日期模式
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		//调用方法parse，将字符串转换成日期对象
		Date birthDate = s.parse(birthday);
		
		//获取今天的日期对象
		Date today = new Date();
		
		//计算？将两个日期对象转换成毫秒值
		long birthdaySecond = birthDate.getTime();
		long todaySecond = today.getTime();
		
		long second = todaySecond - birthdaySecond;
		if(second < 0) {
			System.out.println("你还没出生");
			
		}else {
			System.out.println(second/1000/60/60/24);
		}
	}
}
