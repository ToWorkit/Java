package demo05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws Exception{
		dateLive();
	}
	
	private static void dateLive() throws Exception {
		System.out.println("yyyy-MM-dd");
		// 输入日期
		String _birthday = new Scanner(System.in).next();
		
		// 将字符串转为日期对象
		// 1. 创建日期模式
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		// 2. 将字符串转为日期对象，parse
		Date birthDate = s.parse(_birthday);
		
		// 获取当天的日期对象
		Date today = new Date();
		
		// 将两个日期转为毫秒值计算
		long birthdaySecond = birthDate.getTime();
		long todaySecond = today.getTime();
		
		// 差值
		long _second = todaySecond - birthdaySecond;
		System.out.println((_second < 0) ?"嫌弃": _second / 1000 / 60 / 60 / 24);
	}
}
