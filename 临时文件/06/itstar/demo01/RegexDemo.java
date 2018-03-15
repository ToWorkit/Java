package com.itstar.demo01;

public class RegexDemo {
	public static void main(String[] args) {
		checkEmail();
	}
	
	/*
	 * 检查邮箱是否合法
	 * 
	 * 		规则：
	 * 			123456@qq.com
	 * 		    myemail@sina.com
	 * 			myemail@163.com
	 * 			myemail@yahoo.com.cn
	 * 
	 * @:前 数字 字母 下划线  个数不能小于1个
	 * @:后 数字 字母  个数不能小于1个
	 * .:后面 字母
	 * 
	 */
	public static void checkEmail() {
		String email = "123456@qq.com";
		//为了搞定雅虎的邮箱格式 但是不影响其他邮箱格式 括号里面的一堆可以出现一次或者多次
		boolean b = email.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}
