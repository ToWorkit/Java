package demo03;

/*
 * String��Ĺ��췽��
 * ���ص���ʽ(��ͬ�Ĳ�����ͬ�ķ�������)
 */

public class String03 {
	public static void main(String[] args) {
		fun();
		fun_01();
	}
	
	/**
	 * ���巽����String��Ĺ��췽��
	 * String(byte[] bytes) �����ֽ�����
	 */
	public static void fun() {
		// ���ֽ����鵱�е�ÿ���ֽڣ���ѯ������õ����
		byte[] bytes = {-11, -11};
		String str = new String(bytes);
		System.out.println(str);
	}
	
	/**
	 *  String(byte[] bytes, int offset, int length)
	 *  �ֽ������һ����ת��Ϊ�ַ���
	 *  offset �������ʼ����
	 *  length ����
	 */
	public static void fun_01() {
		byte[] bytes_01 = {65, 66, 69, 65, 66};
		String s = new String(bytes_01, 1, 3);
		System.out.println(s);
	}
	
}
