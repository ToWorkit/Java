package com.itstar.demo03;

public class StringDemo1 {
	public static void main(String[] args) {
		toConvert("asdwqdqASDWQDQWDQA");
	}
	
	/*
	 * ���ַ�������ĸ��д��������ĸСд
	 *    ˼�룺
	 *    	1.��ȡ����ĸ��charAt(0) ת�������ַ� subString(0,1)����ͷ������β
	 *        ת���ɴ�д toUpperCase()
	 *      2.��ȡʣ����ַ�
	 *        ת����Сд toLowerCase()
	 */
	public static void toConvert(String str) {
		//������������ ��������ĸ�ͽ���ʣ���ַ�
		String first = str.substring(0, 1);
		String other = str.substring(1);
		
		//ת���ɴ�д  ����ת����Сд
		first = first.toUpperCase();
		other = other.toLowerCase();
		
		System.out.println(first+ other);
	}
}
