package com.itstar.demo04;

public class TestStringBuffer {
	public static void main(String[] args) {
		int[] arr = {13,14,23,24};
		toString(arr);
	}
	/*
	 * int[] arr = {13,14,23,24};将int[] 数组中的元素转换为字符串
	 * 改成格式：[13,14,23,24]
	 * String s = "["
	 * s + arr[i]
	 * s + "]"
	 * 
	 * StringBuffer实现，节约内存空间
	 */
	public static void toString(int[] arr) {
		//创建StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		//数组遍历
		for(int i = 0;i < arr.length;i++) {
			//判断是不是数组的最后一个元素
			if(i == arr.length-1) {
				buffer.append(arr[i]).append("]");
				
			}else {
				buffer.append(arr[i]).append(",");
			}
		}
		System.out.println(buffer);
	}
}
