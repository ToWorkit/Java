package demo07;

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
	 *  ǰ�����ʵ���˽ӿڻ��߼̳� ���������̬�ǲ����Ե�
	 *  �����ڲ���ֻ��д�ڷ�����
	 */
	public static void main(String[] args) {
		new Smoking() {
			// ��д�ӿ�
			public void smoking() {
				System.out.println("����");
			}
		}.smoking();
	}
}
