package com.itstar.demo07;
/*
 * ������Ƚ��������������ֵ
 * �ؼ��֣� instanceof ��ǰ == > < ,�Ƚ������������͵�
 * ���ǣ�Cat��Dog
 * 
 * �÷���
 * 		���ñ��� instanceof ����
 * 		p instanceof Student
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Teacher();
		Person s = new Student();
		//s.study();������ �������������������
		s.sleep();
		
		boolean b = p instanceof Teacher;
		System.out.println(b);
		
		
		//boolean b1 = p instanceof Animal;������������ p��animal����û���κι�ϵ
	}
}
