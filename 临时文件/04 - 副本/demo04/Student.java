package com.itstar.demo04;
/*
 * ������,super()�ķ�ʽ�����ø���Ĺ��췽��
 * super()���õ��ǿղεĹ��췽��
 * super(����) ���õ��Ǹ�����вι��췽��
 * 
 * ע�⣺
 * 		���๹�췽����һ�У���һ����ʽ����super()
 * public Student(){
 * 	super();
 * }
 */
public class Student extends Person{
	public Student() {
		//�ߵ������еĹ�����
		super("����",18);
	}
}
