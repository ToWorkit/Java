package demo06;

/**
 * �ڲ���
 * 	���ڲ��ඨ�����ⲿ�ĳ�Աλ��
 * 	ͬ�����Լ̳У�ʵ�ֽӿ�
 * ���ù���
 * 	�ڲ������ʹ���ⲿ���Ա������˽��
 * 	�ⲿ��Ҫʹ���ڲ���ĳ�Ա�����뽨���ڲ������
 */

public class Outer {
	private int a = 1;
	// �ⲿ���Աλ�ã������ڲ���
	class Inner {
		int a = 2;
		// ���췽��
		public void Inner() {
			int a = 3;
			// 3 -> �ͽ�ԭ��
			// �ڲ������ֱ��ʹ���ⲿ���˽�г�Ա���� ����ͬһ�����ϵ
			System.out.println("�ڲ���ķ���Inner" + a);
			
			// ������
			System.out.println("������ " + this.a);
			
			// �ⲿ�� 
			System.out.println("�ⲿ�� " + Outer.this.a);
			
		}
	}
}
