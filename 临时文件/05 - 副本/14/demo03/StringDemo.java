package com.itstar.demo03;
/*
 * 获取指定字符串中的，大写字母，小写字母，数字的个数
 * 思想：
 * 		1.计数器,就是int变量,满足条件++
 * 		2.遍历字符串，长度length() + charAt()遍历
 * 		3.字符判断大小写、数字
 */
public class StringDemo {
	public static void main(String[] args) {
		getCount("Aywdqq3234BDD");
	}
	
	public static void getCount(String str) {
		//定义三个变量 计数
		int upper = 0;
		int lower = 0;
		int digit = 0;
		
		//字符串的遍历
		for(int i = 0;i < str.length();i++ ) {
			//String方法的charAt()索引，获取字符
			char c = str.charAt(i);
			//利用编码表进行判断 65-90大写 97-122小写 48-57数字
			if(c >= 65 && c <= 90) {
				upper++;
			}else if(c >= 97 && c <= 122) {
				lower++;
			}else if(c >= 48 && c <= 57) {
				digit++;
			}
		}
		System.out.println("大写字母的个数为："+upper);
		System.out.println("小写字母的个数为："+lower);
		System.out.println("数字的个数"+digit);
	}
}
