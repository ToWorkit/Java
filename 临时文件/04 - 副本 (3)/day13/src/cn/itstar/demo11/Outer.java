package cn.itstar.demo11;
/*
 * ��bin�� Outer$Inner������һ���ڲ��ࣩ
 * 	�ڲ���Ķ��壺
 * 		���ڲ��ඨ�������ⲿ�ĳ�Աλ��
 * 		����Outer,�ڲ�����Inner
 *  ��Ա�ڲ��࣬����ʹ�ó�Ա���η�,public static ...������
 *  Ҳ�Ǹ��࣬���Լ̳У�����ʵ�ֽӿ�
 *  
 *  ���ù����ڲ��࣬����ʹ���ⲿ���Ա������˽��
 *  	         �ⲿ��Ҫʹ���ڲ���ĳ�Ա�����뽨���ڲ������
 */
public class Outer {
	
	private int a = 1;
	//�ⲿ���Աλ�ã������ڲ���
	class Inner{
		public void Inner() {
			//�ڲ������ֱ��ʹ���ⲿ���˽�г�Ա���� ͬ�����ϵ
			System.out.println("�ڲ���ķ���inner"+a);
		}
	}
}
