package com.itstar.demo01;
/*
 * ʵ�����������ַ�������ƥ�䣬ʹ���ַ�����ķ���
 * 	String��������йصķ�����
 * 			boolean matches(String �������)->ƥ��
 * 			"abc".matches("[a]");ƥ��ɹ�����true
 * 
 * 			String[] split(String ����Ĺ���)
 * 			"abc".split("a") ʹ�ù����ַ��������и�
 * 
 * 			String replaceALL(String �������,�ַ���)
 * 			"abc123".replaceALL("\\d","#") �������滻Ϊ#
 */
public class RegexDemo {
	public static void main(String[] args) {
		//checkQQ();
		checkTelNumber();
	}
	/*
	 * ����ֻ����Ƿ�Ϸ�
	 * 1��ͷ �ڶ�λ34578 0-9�̶�11λ
	 */
	public static void checkTelNumber() {
		String tel = "23800000000";
		boolean b = tel.matches("1[34578][0-9]{9}");
		System.out.println(b);
	}
	
	//���QQ���Ƿ�Ϸ�
	public static void checkQQ() {
		String QQ = "0231251123";
		
		boolean b = QQ.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}
}
