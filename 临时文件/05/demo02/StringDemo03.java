package com.itstar.demo02;
/*
 * String��Ĺ��췽��
 * ���ص���ʽ
 */
public class StringDemo03 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * ���巽����String��Ĺ��췽��
	 * String(byte[] bytes) �����ֽ�����
	 * 
	 * 
	 * 
	 */
	public static void function() {
		//���ֽ����鵱�е�ÿ���ֽڣ���ѯ�˱�����õ����
		byte[] bytes = {-11,-45,-99};
		String str = new String(bytes);
		System.out.println(str);
	}
	
	/*
	 * 	String(byte[] bytes, int offset, int length)
	 *  �ֽ������һ����ת��Ϊ�ַ���
	 *  offset �������ʼ����
	 *  length ����
	 */
	
	public static void function_1() {
		byte[] bytes1 = {65,66,67,68,69};
		String s = new String(bytes1, 1, 2);
		System.out.println(s);
	}
}
