package com.itstar.demo02;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * static String toString(数组)
	 * 将数组变为字符串
	 * 返回数组内容的字符串表示形式 
	 */
	public static void function_2() {
		int[] arr = {4,1,3,6,9};
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
	
	/*
	 * static int binarySearch(byte[] a, byte key) 
	 * 数组的二分搜索法
	 * 数组	被查找的元素
	 * 返回值 出现的索引
	 * 元素不存在，返回（-插入点-1）
	 */
	public static void function_1() {
		int[] arr = {1,3,4,6,9,15};
		int index = Arrays.binarySearch(arr, 22);
		System.out.println(index);
	}
	
	/*
	 * static void sort(byte[] a) 
	 * 对数组升序排列 采用的是快速排序
	 */
	public static void function() {
		int[] arr = {11,14,5,33,66,22};
		Arrays.sort(arr);
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
