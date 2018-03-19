package demo07;

import java.util.Arrays;

public class ArrayDemo01 {
	public static void main(String[] args) {
		int[] arr = {55, 60, 77, 95, 100, 103, 20};
		int[] newArray = test(arr);
		for(int i: newArray) {
			System.out.println(i);
		}
		// 转成字符串存储在新的数组中
		System.out.println(Arrays.toString(newArray));
	}
	
	
	/*
	 * 排序后取后三位数
	 */
	public static int[] test(int[] arr) {
		// 排序
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 定义一个定长为3的数组用来存储最后三位数
		int[] result = new int[3];
		
		// 将数组中的最后三位元素，赋值到新的数组当中
		// 要复制的数组，起始位置，储存复制结果的数组，起始位置，复制的个数
		System.arraycopy(arr, 0, result, 0, 3);
		return result;
		
	}
}
