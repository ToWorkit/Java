package demo01;

import java.util.Arrays;

public class ArrayDemo01 {
	public static void main(String[] args) {
		fun_01();
	}
	
	/*
	 * static int binarySearch(byte[] a, byte key) 
	 * ����Ķ���������
	 * ����	�����ҵ�Ԫ��
	 * ����ֵ ���ֵ�����
	 * Ԫ�ز����ڣ����أ�-�����-1��
	 */
	public static void fun() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		// ����ֵΪ����
		int index = Arrays.binarySearch(arr, 4); // 3
		// -(Ԫ�ظ��� + 1)
		int index_01 = Arrays.binarySearch(arr, 8);
		System.out.println(index_01);
	}
	
	/*
	 * static void sort(byte[] a) 
	 * �������������� ���õ��ǿ�������
	 */
	public static void fun_01() {
		int[] arr = {2, 5, 1, 8, 0};
		Arrays.sort(arr);
		/*
		 * static String toString(����)
		 * �������Ϊ�ַ���
		 * �����������ݵ��ַ�����ʾ��ʽ 
		 */
		System.out.println(Arrays.toString(arr));
	}
}
