package demo05;

import java.util.Date;

public class date_01 {	
	public static void main(String[] args) {
		// 当前时间
		System.out.println(new Date());
		second();
	}
	
	// 获取当前日期的毫秒值
	public static void second() {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		Date d = new Date();
		long time_ = d.getTime();
		System.out.println(time_);
	}	
}
