package cn.itstar.demo11;

public class Test {
	public static void main(String[] args) {
		/*
		 * �����ⲿ���е��ڲ���ķ���inner����
		 * �����ⲿ��Ķ����ҵ��ڲ��࣬ͨ���ڲ���Ķ��󣬵����ڲ���ķ���
		 * ��ʽ��	
		 * 		�ⲿ����.�ڲ�����   ���� = new �ⲿ�����().new  �ڲ������();
		 * 		����.�ڲ��෽��();
		 */
		Outer.Inner in = new Outer().new Inner();
		in.Inner();
	}
}
