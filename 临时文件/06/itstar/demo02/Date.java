package com.itstar.demo02;

public class Date {
	/*
	 * date���ʹ��
	 * 	java.util.Date
	 * 
	 * ����ĸ��
	 *  1000����=1��
	 * 1520258586367 ����ֵlong����(intװ����)
	 * 
	 * ʱ��ԭ�㣺��Ԫ1970��1��1�� ��ҹ0:00:00 ����ֵ��0
	 * 
	 * ��Ҫ��ʱ������ڵļ��������������ֵ�����ں���ֵ���������ڷ������ѧ���㣬
	 * ʱ�������� ���ܼ����  2018/3/5
	 * 
	 * �����ϵͳ�еײ㶼���Ժ���ֵ���м����
	 */
	
	public static void main(String[] args) {
		//��ȡ��ǰ���ڵĺ���ֵ
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
}
