package com.itstar.demo04;

public class StringBufferDemo {
	public static void main(String[] args) {
		function_5();
	}
	/*
	 *  String toString() 
                    返回此序列中数据的字符串表示形式。 
        
	 */
	public static void function_5() {
		StringBuffer sb = new StringBuffer();
		sb.append("qdqwdads");
		String buffer = sb.toString();
		System.out.println(buffer);
	}
	
	/*
	 *  StringBuffer reverse() 
                      将此字符序列用其反转形式取代 
                       将缓冲区字符串进行反转
	 */
	public static void function_4() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("asdcaac");
		//反转
		sb.reverse();
		System.out.println(sb);
	}
	
	/*
	 *  StringBuffer replace(int start, int end, String str) 
                     使用给定 String 中的字符替换此序列的子字符串中的字符。 
                    将指定索引上的范围替换成新的字符串
	 */
	public static void function_3() {
		StringBuffer sb = new StringBuffer();
		sb.append("dawdad");
		//包含头 不包含尾
		sb.replace(1, 3, "1");
		System.out.println(sb);
	}
	
	/*
	 * insert(int index,任意类型)
	 * 将任意类型的数据插入到黄冲去的指定索引上
	 */
	public static void function_2(){
		StringBuffer sb = new StringBuffer();
		sb.append("asdadwqdqdqw");
		sb.insert(2, 7.7);
		System.out.println(sb);
	}
	
	/*
	 *  StringBuffer delete(int start, int end) 
                    移除此序列的子字符串中的字符 
                    删除缓冲区字符
	 */
	public static void function_1() {
		StringBuffer sb = new StringBuffer();
		sb.append("asdadwd");
		//包含头不包含尾
		sb.delete(1, 3);
		
		System.out.println(sb);
	}
	
	/*
	 * StringBuffer方法
	 * StringBuffer append ,将任意类型数据添加到缓冲区
	 * append 返回值,写return this
	 */
	public static void function() {
		StringBuffer sb = new StringBuffer();
		StringBuffer buffer = sb.append(6);
		//由于返回值类型还是StringBuffer 
		sb.append(6).append(false).append('b').append(1.5);
		System.out.println(buffer);
	}
}
