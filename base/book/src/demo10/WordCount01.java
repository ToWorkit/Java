package demo10;

import java.util.HashMap;

/**
 * * A:������ʾ
 * ����ͳ���ַ�����ÿ���ַ����ֵĴ���
 * 
 * ����:
 * 1,����һ����Ҫ��ͳ���ַ����ַ���
 * 2,���ַ���ת��Ϊ�ַ�����
 * 3,����˫�м���,�洢�ַ������ַ��Լ��ַ����ֵĴ���
 * 4,�����ַ������ȡÿһ���ַ�,�����ַ��洢��˫�м�����
 * 5,�洢������Ҫ���ж�,��������в����������,�ͽ����ַ�������,ֵΪ1�洢,��������а��������,�ͽ�ֵ��1�洢
 * 6,��ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
 */

public class WordCount01 {
	public static void main(String[] args) {
		// 1, ͳ�Ƶ��ַ���
		String s = "aaacccsssww";
		// 2, ���ַ���תΪ�ַ�����
		char[] arr = s.toCharArray();
		// 3, ����˫�м��ϣ��洢�ַ������ַ��Լ��ַ����ֵĴ���
		HashMap<Character, Integer> hm = new HashMap<>();
		// 4, �����ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
		for(char c: arr) {
			// 5 �жϣ�û����ֵΪ1�������1
			// ����ֵ System.out.println(hm.containsKey(c));
			hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
		}
		System.out.println(hm.keySet());
		// 6, ������ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
		// hm.keySet() -> ������
		for(Character key: hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
