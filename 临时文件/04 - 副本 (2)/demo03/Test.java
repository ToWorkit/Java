package com.itstar.demo03;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		z.show();
		
		//��final���� һ�θ�ֵ ������ final���εĿ��Կ�������
		final int i = 2;
		//i= 10;������ i���ܱ���ֵ
		//int j = i + 1;//��û���޸�i��ֵ
		System.out.println(i);
		
		//��������ڴ��ַ ����ַ����
		final Zi z2 = new Zi();
		//z2 = new Zi();������ ��ʱnew��ַ�ͱ���
	}
}
