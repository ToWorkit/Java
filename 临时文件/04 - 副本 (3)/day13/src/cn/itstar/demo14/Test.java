package cn.itstar.demo14;

public class Test {
	/*
	 * ʹ�������ڲ���
	 * 
	 * 	����ʵ���࣬��д����������ʵ�������һ���㶨
	 *  ��ʽ��
	 *  	new �ӿڻ��߸���(){
	 *  		��д���󷽷�
	 *  	};
	 *  
	 *  ��new��ʼ�����ֺŽ���
	 *  �����˽ӿڵ�ʵ����Ķ���
	 *  ������Ե��÷���������;ǰ����.������
	 *  ��
	 *  XXX x = new XXX();
	 *  x.smoking;�ȼ�
	 *  
	 *  ע�⣺
	 *  ǰ�����ʵ���˽ӿڻ��߼̳� ���������̬���治����
	 *  �����ಿ��ֻ��д�ڷ�����
	 */
	
	public static void main(String[] args) {
		new Smoking() {
			public void smoking() {
				System.out.println("��������");
			}
		}.smoking();
	}
}
