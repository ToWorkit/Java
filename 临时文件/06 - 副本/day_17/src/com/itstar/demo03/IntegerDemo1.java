package com.itstar.demo03;

public class IntegerDemo1 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * Integer�����������
	 *  ������3��������2����̬��Ա����
	 *  
	 *  ������
	 *  	ʮ����ת��Ϊ������toBinarString(int)
	 *  	ʮ����ת��Ϊ�˽���toOctalString(int)
	 *  	ʮ����ת��Ϊʮ������toHexString(int)
	 *  ������������ֵ������String���ͷ���
	 */
	public static void function() {
		//ת���ɶ�����
		System.out.println(Integer.toBinaryString(99));
		//ת��Ϊ�˽���
		System.out.println(Integer.toOctalString(99));
		//ת��Ϊʮ������
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 * Integer��ľ�̬��Ա����
	 * 	MAX_VALE
	 *  MIN_VALUE
	 */
	public static void function_1() {
		//���ֵ ����Сֵ
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
