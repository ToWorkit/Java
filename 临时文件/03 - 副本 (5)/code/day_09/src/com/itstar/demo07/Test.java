package com.itstar.demo07;

public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		NetWork nt = new NetWork();
		
		ee.setId("�з�1��С��");
		ee.setName("�ܴ�");
		
		nt.setId("��ά1��С��");
		nt.setName("�ܶ�");
		
		ee.work();
		nt.work();
	}
}
