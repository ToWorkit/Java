package com.itstar.demo04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	/*
	 * �����ڽ��и�ʽ��
	 *  SimpleDateFormat �����и���ķ��� Ҳ��д�˸���ĳ��󷽷�
	 */
	public static void main(String[] args) {
		function();
	}
	/*
	 * ����ģʽ��
	 * 	yyyy ���
	 *  MM �·�
	 *  dd ���е�����
	 *  HH 0-23Сʱ
	 *  mm Сʱ���еķ���
	 *  ss ��
	 */
	public static void function() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm��ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
}
