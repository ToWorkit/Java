package com.itstar.demo02;

public class Zi extends Fu{
	int a = 2;
	
	public void show() {
		int a = 3;
		//System.out.println(a);
		//this���Ե��ó�Ա����
		//System.out.println(this.a);
		
		//���õļȲ��ǳ�Ա����Ҳ���Ƿ������еı��������Ǹ��൱�еı���
		System.out.println(super.a);
	}
}
