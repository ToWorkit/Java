package demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �����쳣
 */

public class ExceptionDemo03 {
	public static void main(String[] args) throws ParseException {
		fun();
	}
	
	public static void fun() throws ParseException {
		// ��ʽ��ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// ʱ���ʽ���󣬱��벻ͨ��
		Date d = sdf.parse("2018-1");
		System.out.println(d);
	}
}
