package com.itstar.demo03;

public class StringDemo1 {
	public static void main(String[] args) {
		toConvert("asdwqdqASDWQDQWDQA");
	}
	
	/*
	 * 将字符串首字母大写，后面字母小写
	 *    思想：
	 *    	1.获取首字母，charAt(0) 转换的是字符 subString(0,1)包含头不包含尾
	 *        转换成大写 toUpperCase()
	 *      2.获取剩余的字符
	 *        转换成小写 toLowerCase()
	 */
	public static void toConvert(String str) {
		//定义两个变量 接收首字母和接收剩余字符
		String first = str.substring(0, 1);
		String other = str.substring(1);
		
		//转换成大写  其它转换成小写
		first = first.toUpperCase();
		other = other.toLowerCase();
		
		System.out.println(first+ other);
	}
}
