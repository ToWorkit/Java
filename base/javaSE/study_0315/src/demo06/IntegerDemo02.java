package demo06;

public class IntegerDemo02 {
	public static void main(String[] args) {
		fun();
		fun_0();
	}
	/*
	 * Integer�����������
	 *  ������3��������2����̬��Ա����
	 *  
	 *  ������
	 *  	ʮ����ת��Ϊ������toBinarString(int)
	 *  	ʮ����ת��Ϊ�˽���toOctalString(int)
	 *  	ʮ����ת��Ϊʮ������toHexString(int)
	 *  ������������ֵ������String���ͷ���
	 */
	public static void fun() {
		//ת���ɶ�����
		System.out.println(Integer.toBinaryString(99));
		//ת��Ϊ�˽���
		System.out.println(Integer.toOctalString(99));
		//ת��Ϊʮ������
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 * Integer��ľ�̬��Ա����
	 * 	MAX_VALE
	 *  MIN_VALUE
	 */
	public static void fun_0() {
		//���ֵ ����Сֵ
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
