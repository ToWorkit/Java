package demo05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_02 {
	// ���쳣���׳�
	public static void main(String[] args) throws Exception{
		fun();
		fun_1();
	}
	
	/**
	 * DateFormat ��ķ��� parse�����ַ���ת��Ϊdate����
	 */
	public static void fun() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-01-02");
		System.out.println(date);
	}
	
	/*
	 * �����ڽ��и�ʽ��
	 *  SimpleDateFormat �����и���ķ��� Ҳ��д�˸���ĳ��󷽷�
	 * ����ģʽ��
	 * 	yyyy ���
	 *  MM �·�
	 *  dd ���е�����
	 *  HH 0-23Сʱ
	 *  mm Сʱ���еķ���
	 *  ss ��
	 */
	public static void fun_1() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm��ss��");
		String date_ = sdf.format(new Date());
		System.out.println(date_);
	}
}
