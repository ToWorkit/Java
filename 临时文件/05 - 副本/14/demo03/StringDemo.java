package com.itstar.demo03;
/*
 * ��ȡָ���ַ����еģ���д��ĸ��Сд��ĸ�����ֵĸ���
 * ˼�룺
 * 		1.������,����int����,��������++
 * 		2.�����ַ���������length() + charAt()����
 * 		3.�ַ��жϴ�Сд������
 */
public class StringDemo {
	public static void main(String[] args) {
		getCount("Aywdqq3234BDD");
	}
	
	public static void getCount(String str) {
		//������������ ����
		int upper = 0;
		int lower = 0;
		int digit = 0;
		
		//�ַ����ı���
		for(int i = 0;i < str.length();i++ ) {
			//String������charAt()��������ȡ�ַ�
			char c = str.charAt(i);
			//���ñ��������ж� 65-90��д 97-122Сд 48-57����
			if(c >= 65 && c <= 90) {
				upper++;
			}else if(c >= 97 && c <= 122) {
				lower++;
			}else if(c >= 48 && c <= 57) {
				digit++;
			}
		}
		System.out.println("��д��ĸ�ĸ���Ϊ��"+upper);
		System.out.println("Сд��ĸ�ĸ���Ϊ��"+lower);
		System.out.println("���ֵĸ���"+digit);
	}
}
