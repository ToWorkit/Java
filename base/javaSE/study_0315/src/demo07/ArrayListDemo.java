package demo07;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * ����int���͵�����
		 * ���ϱ������ܻ�����������
		 * �������Զ�װ����д洢
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		// �Զ�װ��
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		System.out.println(array.size());
		System.out.println(array.get(0));
		for (int i: array) {
			System.out.println(i);
		}
	}
}
