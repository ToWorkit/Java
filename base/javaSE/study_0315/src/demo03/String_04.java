package demo03;

public class String_04 {
	public static void main(String[] args) {
		fun();
		fun_01();
	}
	
	/**
	 * boolean equals(Object anObject)
	 * �����ַ�����ָ���Ķ���Ƚ�
	 * �ж��ַ����е��ַ��Ƿ���ȫ��ͬ�������ȫ��ͬ����true
	 * 
	 * boolean equalsIgnoreCase(String anotherString)
	 * ���� String ����һ�� String �Ƚϣ������Ǵ�Сд�� 
	 */
	public static void fun() {
		String s1 = "abc";
		String s2 = "Abc";
		
		boolean b = s1.equals(s2);
		boolean b2 = s1.equalsIgnoreCase(s2);
		// �ж��ַ����е��ַ��Ƿ���ȫ��ͬ�������ȫ��ͬ����true
		System.out.println(b);
		// ���Դ�Сд
		System.out.println(b2);
	}
	
	/**
	 * char[] toCharArray()
	 * �����ַ���ת��Ϊһ���µ��ַ����� 
	 */
	public static void fun_01() {
		String s = "test";
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i ++) {
			System.out.println(ch[i]);
		}
	}

}
