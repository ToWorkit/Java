package demo07;

import java.util.Arrays;

public class ArrayDemo01 {
	public static void main(String[] args) {
		int[] arr = {55, 60, 77, 95, 100, 103, 20};
		int[] newArray = test(arr);
		for(int i: newArray) {
			System.out.println(i);
		}
		// ת���ַ����洢���µ�������
		System.out.println(Arrays.toString(newArray));
	}
	
	
	/*
	 * �����ȡ����λ��
	 */
	public static int[] test(int[] arr) {
		// ����
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// ����һ������Ϊ3�����������洢�����λ��
		int[] result = new int[3];
		
		// �������е������λԪ�أ���ֵ���µ����鵱��
		// Ҫ���Ƶ����飬��ʼλ�ã����渴�ƽ�������飬��ʼλ�ã����Ƶĸ���
		System.arraycopy(arr, 0, result, 0, 3);
		return result;
		
	}
}
