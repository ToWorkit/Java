package com.itstar.demo02;

public class StringDemo02 {
	public static void main(String[] args) {
		
		String str1 = new String("abcd");
		String str2 = "abcd";
		System.out.println(str1);
		System.out.println(str2);
		
		//�����������ͣ��Ƚϵ����ڴ��ַ
		System.out.println(str1 == str2);//false
		//String������д��equals���� 
		System.out.println(str1.equals(str2));//true
	}
}
