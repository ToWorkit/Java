package com.itstar.demo01;

import java.util.Calendar;

public class Calendar2 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * Calendar���set���� ��������set(int field,int value);
	 * field:�ֶ�
	 * value:����ֵ
	 * set(int year, int month, int date) ���ݵ���3���������� �� ��
	 */
	public static void function_1() {
		Calendar c = Calendar.getInstance();
		//c.set(Calendar.MONTH, 1);
		//����
		c.set(2018, 3, 28);
		//��ȡ���
		int year = c.get(Calendar.YEAR);
		
		//��ȡ�·�
		int month = c.get(Calendar.MONTH) + 1;
		
		//��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println(year + "��" + month + "��" + day + "��");
	}
	
	/*
	 * Calendar���get���� ��ȡ�����ֶε�ֵ int get(int)
	 * ��ȡ�������ֶ� ����ֵ��int ���ڵ��Ǿ�������ֵ
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		//��ȡ���
		int year = c.get(Calendar.YEAR);
		//��ȡ�·�
		int month = c.get(Calendar.MONTH) + 1;
		//��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"��"+month+"��"+day+"��");
	}
}
