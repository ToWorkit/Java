package demo02;

/*
 * LinkedHashSet ��������Ĺ�ϣ���ʵ��
 * �̳���HashSet
 * 
 * LinkedHashSet�������ԣ� ����˳��ģ��洢��ȡ����˳����ͬ
 * �̲߳���ȫ�ļ��ϣ������ٶȿ�
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(33);
		link.add(12);
		link.add(13);
		link.add(34);
		link.add(34);
		System.out.println(link);
	}
}
