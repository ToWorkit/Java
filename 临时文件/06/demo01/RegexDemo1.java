package com.itstar.demo01;

public class RegexDemo1 {
	public static void main(String[] args) {
		split_3();
	}
	/*
	 * String�෽��split���ַ��������и�
	 * 192.168.50.146 �и�ip��ַ
	 */
	public static void split_3() {
		String str = "192.168.50.146";
		//.������������ַ� ���Զ�ƥ�� ������ ���ֳ��� ��\\������ʽ2����һ��
		String[] arr = str.split("\\.");
		System.out.println("����ĳ���Ϊ��"+arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	/*
	 * String�෽��split���ַ��������и�
	 * 22 33 44 55
	 */
	public static void split_2() {
//		String str = "22 33 44 55";
//		String[] arr = str.split(" ");
//		System.out.println("����ĳ���Ϊ��"+arr.length);
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//��������˶���ո�
		String str = "22 33     44    55";
		String[] arr = str.split(" +");
		System.out.println("����ĳ���Ϊ��"+arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	/*
	 * String�෽��split���ַ��������и�
	 * 22-33-44-55  ����-�����и�
	 */
	public static void split_1() {
		String str = "22-33-44-55";
		//�и�  ������Ϊ��������
		String[] arr = str.split("-");
		System.out.println("����ĳ���Ϊ��"+arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
