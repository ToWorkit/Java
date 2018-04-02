package demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 编译异常
 */

public class ExceptionDemo03 {
	public static void main(String[] args) throws ParseException {
		fun();
	}
	
	public static void fun() throws ParseException {
		// 格式化时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 时间格式错误，编译不通过
		Date d = sdf.parse("2018-1");
		System.out.println(d);
	}
}
