package demo05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_02 {
	// 有异常则抛出
	public static void main(String[] args) throws Exception{
		fun();
		fun_1();
	}
	
	/**
	 * DateFormat 类的方法 parse，将字符串转换为date对象
	 */
	public static void fun() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-01-02");
		System.out.println(date);
	}
	
	/*
	 * 对日期进行格式化
	 *  SimpleDateFormat ：即有父类的方法 也重写了父类的抽象方法
	 * 日期模式：
	 * 	yyyy 年份
	 *  MM 月份
	 *  dd 月中的天数
	 *  HH 0-23小时
	 *  mm 小时当中的分钟
	 *  ss 秒
	 */
	public static void fun_1() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
		String date_ = sdf.format(new Date());
		System.out.println(date_);
	}
}
