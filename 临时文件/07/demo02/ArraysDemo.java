package com.itstar.demo02;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * static String toString(����)
	 * �������Ϊ�ַ���
	 * �����������ݵ��ַ�����ʾ��ʽ 
	 */
	public static void function_2() {
		int[] arr = {4,1,3,6,9};
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
	
	/*
	 * static int binarySearch(byte[] a, byte key) 
	 * ����Ķ���������
	 * ����	�����ҵ�Ԫ��
	 * ����ֵ ���ֵ�����
	 * Ԫ�ز����ڣ����أ�-�����-1��
	 */
	public static void function_1() {
		int[] arr = {1,3,4,6,9,15};
		int index = Arrays.binarySearch(arr, 22);
		System.out.println(index);
	}
	
	/*
	 * static void sort(byte[] a) 
	 * �������������� ���õ��ǿ�������
	 */
	public static void function() {
		int[] arr = {11,14,5,33,66,22};
		Arrays.sort(arr);
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
