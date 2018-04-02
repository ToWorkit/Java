package demo06;

public class IntegerDemo01 {
	public static void main(String[] args) {
		fun();
		fun01();
		fun02();
	}
	
	/*
	 * Integer�൱�еķ�����parseInt(String s) 
	 * ����ֵint(������������)
	 * Ҫ���ַ������������ָ�ʽ��
	 * */
	public static void fun() {
		int a = Integer.parseInt("20");
		System.out.println(a + 1);
	}
	
	/*
	 * parseInt(String s, int radix)
	 * radix:���� ����
	 * parseInt:���н����ʮ����
	 */
	public static void fun01() {
		int a = Integer.parseInt("A", 16);
		System.out.println(a);
	}
	
	/*
	 * Integer ��Ĺ��췽��
	 * 	Integer(String s) 
	 * �����ָ�ʽ���ַ������ݵ�Integer�Ĺ��췽����
	 */
	public static void fun02() {
		Integer in = new Integer(5);
		int i = in.intValue();
		System.out.println(++i);
	}
	
	
}
