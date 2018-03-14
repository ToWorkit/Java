package com.itstar.demo02;
/*
 * String类的特点：
 * 		一切都是对象，字符串事物"" 也是对象
 * 		类是描述事物的,String类，描述的是字符串对象的类
 * 	   	 所有的"" 都是String类的对象
 * 	
 * 		字符串是常量，一旦创建 不能改变
 *      定义好字符串对象  不变
 */
public class StringDemo01 {
	public static void main(String[] args) {
		//String -> 字符串的类  str->这个类的引用类型变量"itstaredu"->这个类的对象
		//String对象 不要new
		//String类重写了toString方法，所以拿到的是不是地址
		String str = "itstaredu";
		System.out.println(str);
		//双引号里面的字符串常量不变 ，引用类型可以变
		str = "itstar";
		System.out.println(str);
		
	}
}
