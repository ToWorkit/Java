package com.itstar.demo01;
/*
 * ��ѧ������Math
 */
public class MathDemo {
	public static void main(String[] args) {
		function_6();
//		int a = abs(-8);
//		System.out.println(a);
	}
	/*
	 * long round(double a) 
	 * ��ȡ����4��5���ֵ ȡ����
	 */
	public static void function_6() {
		double d = Math.round(4.978);
		System.out.println(d);
	}
	
	/*
	 * double random() ���� �����0.0-1.0֮��
	 * ��Դ��Random��
	 */
	public static void function_5(){
		for(int i = 0;i < 10;i++) {
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	/*
	 * double sqrt(double a) 
	 * ���ز�����ƽ����
	 */
	public static void function_4() {
		//NaN->not a number ����û��ƽ����
		double d = Math.sqrt(-2);
		System.out.println(d);
	}
	
	/*
	 *  double pow(double a, double b) 
	 *  a��b�η�
	 */
	public static void function_3() {
		double d = Math.pow(3, 3);
		System.out.println(d);
	}
	
	/*
	 *  double floor(double a) 
	 *  ����С�ڻ��ߵ��ڲ���a���������
	 */
	public static void function_2() {
		double d = Math.floor(-2.3);
		System.out.println(d);
	}
	
	/*
	 * double ceil(double a) 
	 * ���ش��ڲ���a����С����
	 */
	public static void function_1() {
		double d = Math.ceil(5.2);
		System.out.println(d);
	}
	
	/*
	 * double abs(int a) 
	 * ��ȡ�����ľ���ֵ
	 */
	public static void function() {
		int a = Math.abs(-3);
		System.out.println(a);
	}
	
	/*
	 * �Լ�д��
	 */
	public static int abs(int i) {
		if(i >= 0) {
			return i;
		}else {
			return -i;
		}
	}
}
