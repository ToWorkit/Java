package demo03;

public class Studay_06 {
	public static void main(String[] args) {
		fun();
		fun_01();
	}
	
	/**
	 * boolean endsWith(String suffix)
	 *  ���Դ��ַ����Ƿ���ָ���ĺ�׺����
	 */
	public static void fun() {
		String s = "test";
		boolean b = s.endsWith("s");
		System.out.println(b);
	}
	
	/**
	 * String substring(int beginIndex, int endIndex) 
	 * 	����һ�����ַ�����
	 *  ��ͷ����β
	 *  
	 * String substring(int beginIndex) 
	 * 	��ͷ��β
	 */
	public static void fun_01() {
		String s = "Hello World";
		String s_1 = s.substring(1, 4);
		System.out.println(s_1);
		String s_2 = s.substring(4);
		System.out.println(s_2);
	}
}
