package com.itstar.demo02;

import java.util.Calendar;

public class RunNian {
	public static void main(String[] args) {
		function();
	}
	
	/*
	 * �������ĸ߼��㷨��
	 * 	�ж� 2000 3000
	 * ����������ָ������ݵ�3��1�� add��ǰƫ��һ�죬��ȡ��������29��������� 28����
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		//����ʱ�� ����0-11��
		c.set(2000, 2, 1);
		//����add������ǰƫ��һ��
		c.add(Calendar.DAY_OF_MONTH, -1);
		//��get�������������
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
