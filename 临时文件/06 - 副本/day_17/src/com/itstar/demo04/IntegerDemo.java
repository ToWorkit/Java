package com.itstar.demo04;
/*
 * JDK1.5֮�������
 * �Զ�װ�䣺�����������ͣ�ֱ�ӱ�ɶ���
 * 
 * �Զ����䣺�����е����ݱ�ػ�����������
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * �׶ˣ����ֿ�ָ���쳣
	 */
	public static void function_1() {
		Integer i = null;
		//���� i = i.intValue() + 1 null�ܵ��÷����𣿲���
		i = i + 1;
		System.out.println(i);
	}
	
	/*
	 * �Զ�װ�������ĺô���ʡ���룬�������ͺ���������ֱ�Ӽ���
	 */
	public static void function() {
		//�������� ���ñ���ָ�����
		//�Զ�װ�� ֱ�Ӱѻ�����������5 ����˶���
		Integer i = 5;//Integer i = new Integer(5);
		System.out.println(i.toString());
		
		//�������������������𣿳������Զ�����-������������ת��Ϊ��������
		i = i + 1;
		System.out.println(i);
	}
	/*
	 * �Զ�װ��ĺô���
	 * 	ArrayList<Integer> arr = new ArrayList<Integer>();
	 * arr.add(1); ��ӵ��ǻ����������ͣ������Զ�װ��
	 */
}
