package com.itstar.demo04;

public class StringBufferDemo {
	public static void main(String[] args) {
		function_5();
	}
	/*
	 *  String toString() 
                    ���ش����������ݵ��ַ�����ʾ��ʽ�� 
        
	 */
	public static void function_5() {
		StringBuffer sb = new StringBuffer();
		sb.append("qdqwdads");
		String buffer = sb.toString();
		System.out.println(buffer);
	}
	
	/*
	 *  StringBuffer reverse() 
                      �����ַ��������䷴ת��ʽȡ�� 
                       ���������ַ������з�ת
	 */
	public static void function_4() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("asdcaac");
		//��ת
		sb.reverse();
		System.out.println(sb);
	}
	
	/*
	 *  StringBuffer replace(int start, int end, String str) 
                     ʹ�ø��� String �е��ַ��滻�����е����ַ����е��ַ��� 
                    ��ָ�������ϵķ�Χ�滻���µ��ַ���
	 */
	public static void function_3() {
		StringBuffer sb = new StringBuffer();
		sb.append("dawdad");
		//����ͷ ������β
		sb.replace(1, 3, "1");
		System.out.println(sb);
	}
	
	/*
	 * insert(int index,��������)
	 * ���������͵����ݲ��뵽�Ƴ�ȥ��ָ��������
	 */
	public static void function_2(){
		StringBuffer sb = new StringBuffer();
		sb.append("asdadwqdqdqw");
		sb.insert(2, 7.7);
		System.out.println(sb);
	}
	
	/*
	 *  StringBuffer delete(int start, int end) 
                    �Ƴ������е����ַ����е��ַ� 
                    ɾ���������ַ�
	 */
	public static void function_1() {
		StringBuffer sb = new StringBuffer();
		sb.append("asdadwd");
		//����ͷ������β
		sb.delete(1, 3);
		
		System.out.println(sb);
	}
	
	/*
	 * StringBuffer����
	 * StringBuffer append ,����������������ӵ�������
	 * append ����ֵ,дreturn this
	 */
	public static void function() {
		StringBuffer sb = new StringBuffer();
		StringBuffer buffer = sb.append(6);
		//���ڷ���ֵ���ͻ���StringBuffer 
		sb.append(6).append(false).append('b').append(1.5);
		System.out.println(buffer);
	}
}
