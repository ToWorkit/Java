package demo06;

public class Taste {
	public static void main(String[] args) {
		/*
		 * �����ⲿ���е��ڲ���ķ���inner����
		 * �����ⲿ��Ķ����ҵ��ڲ��࣬ͨ���ڲ���Ķ��󣬵����ڲ���ķ���
		 * ��ʽ��	
		 * 		�ⲿ����.�ڲ�����   ���� = new �ⲿ�����().new  �ڲ������();
		 * 		����.�ڲ��෽��();
		 */
		Outer.Inner i = new Outer().new Inner();
		i.Inner();
	}
}
