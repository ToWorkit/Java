package demo02;

/*
 * �ڲ���
 * 	����
 * 		�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
 * 		�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
 * 		�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������
 */

public class InnerClass01 {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.method();
	}
}

class Outer {
	private int num = 10;
	class Inner {
		public void method() {
			System.out.println(num + 1);
		}
	}
}
