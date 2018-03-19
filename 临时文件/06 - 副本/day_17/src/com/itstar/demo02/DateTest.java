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
	 * ������˶�����
	 * 		��������������
	 * 		�������ڱ�ɺ���ֵ������
	 */
	public static void function() throws Exception {
		System.out.println("��������ĳ������� ��ʽyyyy-MM-dd");
		//��ȡ�������ڣ���������
		String birthday = new Scanner(System.in).next();
		
		//���ַ���ת�������ڶ���
		//����SimpleDateFormat����д����ģʽ
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		//���÷���parse�����ַ���ת�������ڶ���
		Date birthDate = s.parse(birthday);
		
		//��ȡ��������ڶ���
		Date today = new Date();
		
		//���㣿���������ڶ���ת���ɺ���ֵ
		long birthdaySecond = birthDate.getTime();
		long todaySecond = today.getTime();
		
		long second = todaySecond - birthdaySecond;
		if(second < 0) {
			System.out.println("�㻹û����");
			
		}else {
			System.out.println(second/1000/60/60/24);
		}
	}
}
