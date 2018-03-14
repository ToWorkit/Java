package com.itstar.demo03;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "javahellojavastratjavaint";
		int count = getStringCount(str,"java");
		System.out.println(count);
	}
	
	/*
	 * 获取一个字符串中另一个字符串出现的次数
	 * 
	 * 	思想：
	 * 		1.indexOf() 找到字符串第一次出现的索引
	 *  	2.找到索引+字符串的长度 ，截取长度
	 *      3.计数器++
	 */
	public static int getStringCount(String str,String key) {
		//定义一个计数器
		int count = 0;
		//定义变量 保存indexOf查找后索引的结果
		int index = 0;
		//开始循环查找
		while((index = str.indexOf(key)) != -1) {
			count++;
			//获取到索引和字符串求和，截取字符串
			str = str.substring(index+key.length());
			
		}
		return count;
	}
}
