package com.itstar.demo04;

public class TestStringBuffer {
	public static void main(String[] args) {
		int[] arr = {13,14,23,24};
		toString(arr);
	}
	/*
	 * int[] arr = {13,14,23,24};��int[] �����е�Ԫ��ת��Ϊ�ַ���
	 * �ĳɸ�ʽ��[13,14,23,24]
	 * String s = "["
	 * s + arr[i]
	 * s + "]"
	 * 
	 * StringBufferʵ�֣���Լ�ڴ�ռ�
	 */
	public static void toString(int[] arr) {
		//����StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		//�������
		for(int i = 0;i < arr.length;i++) {
			//�ж��ǲ�����������һ��Ԫ��
			if(i == arr.length-1) {
				buffer.append(arr[i]).append("]");
				
			}else {
				buffer.append(arr[i]).append(",");
			}
		}
		System.out.println(buffer);
	}
}
