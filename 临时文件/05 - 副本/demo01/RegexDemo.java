package com.itstar.demo01;
/*
 * 实现正则规则和字符串进行匹配，使用字符串类的方法
 * 	String类和正则有关的方法：
 * 			boolean matches(String 正则规则)->匹配
 * 			"abc".matches("[a]");匹配成功返回true
 * 
 * 			String[] split(String 正则的规则)
 * 			"abc".split("a") 使用规则将字符串进行切割
 * 
 * 			String replaceALL(String 正则规则,字符串)
 * 			"abc123".replaceALL("\\d","#") 将数字替换为#
 */
public class RegexDemo {
	public static void main(String[] args) {
		//checkQQ();
		checkTelNumber();
	}
	/*
	 * 检查手机号是否合法
	 * 1开头 第二位34578 0-9固定11位
	 */
	public static void checkTelNumber() {
		String tel = "23800000000";
		boolean b = tel.matches("1[34578][0-9]{9}");
		System.out.println(b);
	}
	
	//检查QQ号是否合法
	public static void checkQQ() {
		String QQ = "0231251123";
		
		boolean b = QQ.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}
}
