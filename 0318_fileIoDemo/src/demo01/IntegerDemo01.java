package demo01;

/*
 * �Զ�װ��: �����������ͱ�ΪΪ����
 * 
 * �Զ�����: �����е����ݱ�ػ�����������
 */

public class IntegerDemo01 {
	public static void main(String[] args) {
		fun();
	}
	
	public static void fun() {
		
/*		Integer i = 2;
		// �Զ�����תΪ�������ݲ�������
		i = i + 1;
		System.out.println(i); // 3 */
		
		/*
		 * ����ֿ�ָ���쳣
		 */
		Integer i = null;
		i = i + 1;
		System.out.println(i); // java.lang.NullPointerException
	}
}
