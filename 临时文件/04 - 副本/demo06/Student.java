package com.itstar.demo06;
/*
 * ���췽���ĵ�һ��дthis();����super();
 * ����ͬʱ���ڣ���ѡ��һ����֤��������й��췽�����Ե��ø���Ĺ��췽������
 * 
 * ���ۣ�������Σ���������й��췽����ֱ�ӡ���ӵ��õ�����Ĺ��췽��
 * 		����Ĺ��췽����ʲô����д��Ĭ�Ϲ��췽���ĵ�һ�о���super();
 * 
 */
public class Student extends Person{
//	public Student() {
//		//super();
//		this(); this���õ��Ǳ��൱�еĹ��췽��
//	}
	
	public Student() {
		//���Ե�������Ĺ��췽��
		this("aaa");
	}
	
	public Student(String s) {
		super(2);
	}
}
