package com.itstar.demo02;
/*
 * String��Ĳ��ҹ���
 */
public class StringDemo04 {
	public static void main(String[] args) {
		function_8();
	}
	/*
	 *  boolean equals(Object anObject) 
                    �����ַ�����ָ���Ķ���Ƚ� 
       	�ж��ַ����е��ַ��Ƿ���ȫ��ͬ�������ȫ��ͬ����true
       	
       	 boolean equalsIgnoreCase(String anotherString) 
                       ���� String ����һ�� String �Ƚϣ������Ǵ�Сд�� 
	 */
	public static void function_8() {
		String str1 = "abc";
		String str2 = "ABc";
		
		boolean b = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println(b2);
		
	}
	
	/*
	 *  char[] toCharArray() 
                    �����ַ���ת��Ϊһ���µ��ַ����顣 
	 */
	public static void function_6() {
		String str = "itstar.java";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
	
	/*
	 *  byte[] getBytes() 
                    ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С�
                   ���ַ���ת��Ϊ�ַ����� 
	 */
	public static void function_5() {
		String str = "abcde";
		byte[] bytes = str.getBytes();
		for(int i=0;i<bytes.length;i++) {
			System.out.println(bytes[i]);
		}
	}
	
	
	
	/*
	 *  int indexOf(int ch) 
                    ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ��������� 
	 */
	public static void function_4() {
		String str = "itstar.com";
		//����a�ַ����ַ���������λ��
		int index = str.indexOf("a");
		System.out.println(index);
	}
	
	/*
	 *  boolean contains(CharSequence s) 
                    ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true�� 
	 */
	public static void function_3() {
		String str = "itstars.com";
		//�ж�һ���ַ������Ƿ���������ַ���
		boolean b = str.contains("st");
		System.out.println(b);
	}
	
	/*
	 *  boolean endsWith(String suffix) 
                    ���Դ��ַ����Ƿ���ָ���ĺ�׺������ 
	 */
	public static void function_2() {
		String str = "a.java";
		boolean b = str.endsWith(".java");
		System.out.println(b);
	}
	
	/*
	 *  String substring(int beginIndex, int endIndex) ����һ�����ַ�����
	 *  ���Ǵ��ַ�����һ�����ַ��� 
	 *  ����ͷ��������β
	 *  
	 *   String substring(int beginIndex) 
                       ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ���
         
	 */
	public static void function_1() {
		String str = "areyouok";
		//���������� 
		String s1 = str.substring(1, 3);
		System.out.println(s1);
		//��ȡ�ַ�����һ���� ����ͷ �����ȫҪ
		String s2 = str.substring(2);
		System.out.println(s2);
	}
	
	/*
	 *  int length() ���ش��ַ����ĳ��� 
	 *  
	 */
	public static void function() {
		String str = "asdaddqwqwdwqdwq";
		int i = str.length();
		System.out.println(i);
	}
}
