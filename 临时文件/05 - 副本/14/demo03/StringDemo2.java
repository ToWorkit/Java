package com.itstar.demo03;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "javahellojavastratjavaint";
		int count = getStringCount(str,"java");
		System.out.println(count);
	}
	
	/*
	 * ��ȡһ���ַ�������һ���ַ������ֵĴ���
	 * 
	 * 	˼�룺
	 * 		1.indexOf() �ҵ��ַ�����һ�γ��ֵ�����
	 *  	2.�ҵ�����+�ַ����ĳ��� ����ȡ����
	 *      3.������++
	 */
	public static int getStringCount(String str,String key) {
		//����һ��������
		int count = 0;
		//������� ����indexOf���Һ������Ľ��
		int index = 0;
		//��ʼѭ������
		while((index = str.indexOf(key)) != -1) {
			count++;
			//��ȡ���������ַ�����ͣ���ȡ�ַ���
			str = str.substring(index+key.length());
			
		}
		return count;
	}
}
