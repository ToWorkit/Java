package demo09;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @param args
 * ������
 * HashMap��Hashtable������
 * ��ͬ��:
 * �ײ㶼�ǹ�ϣ�㷨,����˫�м���
 * ����:
 * 1,HashMap���̲߳���ȫ��,Ч�ʸ�,JDK1.2�汾
 *   Hashtable���̰߳�ȫ��,Ч�ʵ�,JDK1.0�汾��
 * 2,HashMap���Դ洢null����nullֵ
 *   Hashtable�����Դ洢null����nullֵ
 */

public class HashTable01 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a", 11);
		hm.put(null, 11);
		hm.put("b", null);
		System.out.println(hm);
		
		
		//  java.lang.NullPointerException ������洢nullֵ���߼�
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("a", 12);
		ht.put(null, 10);
		ht.put("c", null);
		
		System.out.println(ht);
	}
}
