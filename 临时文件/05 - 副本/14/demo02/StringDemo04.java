package com.itstar.demo02;
/*
 * String类的查找功能
 */
public class StringDemo04 {
	public static void main(String[] args) {
		function_8();
	}
	/*
	 *  boolean equals(Object anObject) 
                    将此字符串与指定的对象比较 
       	判断字符串中的字符是否完全相同，如果完全相同返回true
       	
       	 boolean equalsIgnoreCase(String anotherString) 
                       将此 String 与另一个 String 比较，不考虑大小写。 
	 */
	public static void function_8() {
		String str1 = "abc";
		String str2 = "ABc";
		
		boolean b = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println(b2);
		
	}
	
	/*
	 *  char[] toCharArray() 
                    将此字符串转换为一个新的字符数组。 
	 */
	public static void function_6() {
		String str = "itstar.java";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
	
	/*
	 *  byte[] getBytes() 
                    使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
                   将字符串转换为字符数组 
	 */
	public static void function_5() {
		String str = "abcde";
		byte[] bytes = str.getBytes();
		for(int i=0;i<bytes.length;i++) {
			System.out.println(bytes[i]);
		}
	}
	
	
	
	/*
	 *  int indexOf(int ch) 
                    返回指定字符在此字符串中第一次出现处的索引。 
	 */
	public static void function_4() {
		String str = "itstar.com";
		//查找a字符在字符串的索引位置
		int index = str.indexOf("a");
		System.out.println(index);
	}
	
	/*
	 *  boolean contains(CharSequence s) 
                    当且仅当此字符串包含指定的 char 值序列时，返回 true。 
	 */
	public static void function_3() {
		String str = "itstars.com";
		//判断一个字符串中是否包含其它字符串
		boolean b = str.contains("st");
		System.out.println(b);
	}
	
	/*
	 *  boolean endsWith(String suffix) 
                    测试此字符串是否以指定的后缀结束。 
	 */
	public static void function_2() {
		String str = "a.java";
		boolean b = str.endsWith(".java");
		System.out.println(b);
	}
	
	/*
	 *  String substring(int beginIndex, int endIndex) 返回一个新字符串，
	 *  它是此字符串的一个子字符串 
	 *  包含头，不包含尾
	 *  
	 *   String substring(int beginIndex) 
                       返回一个新的字符串，它是此字符串的一个子字符串
         
	 */
	public static void function_1() {
		String str = "areyouok";
		//参数是索引 
		String s1 = str.substring(1, 3);
		System.out.println(s1);
		//获取字符串的一部分 包含头 后面的全要
		String s2 = str.substring(2);
		System.out.println(s2);
	}
	
	/*
	 *  int length() 返回此字符串的长度 
	 *  
	 */
	public static void function() {
		String str = "asdaddqwqwdwqdwq";
		int i = str.length();
		System.out.println(i);
	}
}
