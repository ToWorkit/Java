package com.itstar.demo03;

import java.util.ArrayList;

/*
 * ���з��͵���
 * 		ArrayList<E>
 * E:Element Ԫ�أ�����
 * ArrayList<Integer>,E���յľ���Integer����
 * 
 * public class ArrayList<E>{
 * 	
 * }
 * 
 */
public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(123);
		array.add(345);
		
		//ArrayList�������Լ��ķ���
		//<T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
		//���ϱ�Ϊ����
		Integer[] j = array.toArray(i);
		for(Integer z:j) {
			System.out.println(z);
		}
	}
}
