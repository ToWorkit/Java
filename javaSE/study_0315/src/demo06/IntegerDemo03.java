package demo06;

/*
 * JDK1.5֮��
 * �Զ�װ��: �����������ͣ�ֱ�ӱ�ɶ���
 * �Զ�����: �����е����ݱ�ػ�����������
 */

public class IntegerDemo03 {
	public static void main(String[] args) {
		fun();
	}
	
	public static void fun() {
		// �������ͣ����ñ���ָ�����
		// �Զ�װ��, �ѻ�������������ʽתΪ�˶���
		Integer i = 5; // -> Integer i = new Integer(5);
		System.out.println(i.toString());
		
		// �����������㣬�Զ�����, ����������תΪ�˻�������
		i += 1;
		System.out.println(i);
	}
}
