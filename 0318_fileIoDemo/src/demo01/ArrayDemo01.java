package demo01;

import java.util.Arrays;

public class ArrayDemo01 {
	public static void main(String[] args) {
		fun_01();
	}
	
	/*
	 * static int binarySearch(byte[] a, byte key) 
	 * 数组的二分搜索法
	 * 数组	被查找的元素
	 * 返回值 出现的索引
	 * 元素不存在，返回（-插入点-1）
	 */
	public static void fun() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		// 返回值为索引
		int index = Arrays.binarySearch(arr, 4); // 3
		// -(元素个数 + 1)
		int index_01 = Arrays.binarySearch(arr, 8);
		System.out.println(index_01);
	}
	
	/*
	 * static void sort(byte[] a) 
	 * 对数组升序排列 采用的是快速排序
	 */
	public static void fun_01() {
		int[] arr = {2, 5, 1, 8, 0};
		Arrays.sort(arr);
		/*
		 * static String toString(数组)
		 * 将数组变为字符串
		 * 返回数组内容的字符串表示形式 
		 */
		System.out.println(Arrays.toString(arr));
	}
}
