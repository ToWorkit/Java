package com.itstar.demo02;

import java.util.Arrays;

public class TestArr {
	public static void main(String[] args) {
		int[] arr = {55,60,77,95,100};
		int[] newArray = test(arr);
		//转成字符串存储在新数组中
		System.out.println(Arrays.toString(newArray));
	}
	
	/*
	 * 定义一个方法，接收输入，存储5个人的考试成绩
	 * 将最后三个学生的成绩及存储在新数组当中 ，返回新的数组
	 */
	public static int[] test(int[] arr) {
		//对数组进行排序
		Arrays.sort(arr);
		//将最后三个人成绩存储在新数组当中
		int[] result = new int[3];
		//将成绩数组中的最后㳀元素，赋值到新的数组当中
		/*
		 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 *     
		 */
		System.arraycopy(arr, 0, result, 0, 3);
		return result;
	}
}
