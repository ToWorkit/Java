package demo03;

/*
 * String类的构造方法
 * 重载的形式(不同的参数不同的方法操作)
 */

public class String03 {
	public static void main(String[] args) {
		fun();
		fun_01();
	}
	
	/**
	 * 定义方法，String类的构造方法
	 * String(byte[] bytes) 传递字节数组
	 */
	public static void fun() {
		// 将字节数组当中的每个字节，查询编码表，得到结果
		byte[] bytes = {-11, -11};
		String str = new String(bytes);
		System.out.println(str);
	}
	
	/**
	 *  String(byte[] bytes, int offset, int length)
	 *  字节数组的一部分转换为字符串
	 *  offset 数组的起始索引
	 *  length 个数
	 */
	public static void fun_01() {
		byte[] bytes_01 = {65, 66, 69, 65, 66};
		String s = new String(bytes_01, 1, 3);
		System.out.println(s);
	}
	
}
