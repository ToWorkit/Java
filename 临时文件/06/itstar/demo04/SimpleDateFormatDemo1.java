package com.itstar.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
	public static void main(String[] args) throws Exception {
		function();
	}
	/*
	 * DateFormat��ķ���parse
	 *  ���ַ���ת��Ϊdate����
	 */
	public static void function() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-1-1");
		System.out.println(date);
	}
}
