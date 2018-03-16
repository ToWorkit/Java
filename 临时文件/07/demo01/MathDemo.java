package com.itstar.demo01;
/*
 * 数学工具类Math
 */
public class MathDemo {
	public static void main(String[] args) {
		function_6();
//		int a = abs(-8);
//		System.out.println(a);
	}
	/*
	 * long round(double a) 
	 * 获取参数4舍5入的值 取整数
	 */
	public static void function_6() {
		double d = Math.round(4.978);
		System.out.println(d);
	}
	
	/*
	 * double random() 返回 随机数0.0-1.0之间
	 * 来源自Random类
	 */
	public static void function_5(){
		for(int i = 0;i < 10;i++) {
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	/*
	 * double sqrt(double a) 
	 * 返回参数的平方根
	 */
	public static void function_4() {
		//NaN->not a number 负数没有平方根
		double d = Math.sqrt(-2);
		System.out.println(d);
	}
	
	/*
	 *  double pow(double a, double b) 
	 *  a的b次方
	 */
	public static void function_3() {
		double d = Math.pow(3, 3);
		System.out.println(d);
	}
	
	/*
	 *  double floor(double a) 
	 *  返回小于或者等于参数a的最大整数
	 */
	public static void function_2() {
		double d = Math.floor(-2.3);
		System.out.println(d);
	}
	
	/*
	 * double ceil(double a) 
	 * 返回大于参数a的最小整数
	 */
	public static void function_1() {
		double d = Math.ceil(5.2);
		System.out.println(d);
	}
	
	/*
	 * double abs(int a) 
	 * 获取参数的绝对值
	 */
	public static void function() {
		int a = Math.abs(-3);
		System.out.println(a);
	}
	
	/*
	 * 自己写个
	 */
	public static int abs(int i) {
		if(i >= 0) {
			return i;
		}else {
			return -i;
		}
	}
}
