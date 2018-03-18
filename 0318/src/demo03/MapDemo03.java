package demo03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map ���ϻ�ȡ��ʽ
 * 	entrySet ��ʽ����ֵ��ӳ���ϵ��ȡ
 * 1. ����Map���� Entry�ڲ���� ����entrySet()�� �����ϵ�ӳ���ϵ����洢��set���� Set<Map.Entry<key, value>> ���ϵ�Ƕ��
 * 2. ����Set����
 * 3. ��ȡ��Set���ϵ�Ԫ�أ���ӳ���ϵ����
 * 4. ͨ��ӳ���ϵ���󷽷�getKey, getValue��ȡ��ֵ��
 */

public class MapDemo03 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "a");
		map.put(1, "b");
		map.put(2, "c");
		map.put(3, "d");
		map.put(4, "e");
		
		// 1. ���ü��ϵ� entrySet���������ϵ�ӳ���ϵ�洢��Set������ Set<Map.Entry<key, value>> ����Ƕ��
		// �������ڲ�����ⲿ��Ĺ�ϵ��ͨ���ⲿ������� Map �������ڲ��� Entry -> Map.Entry
		Set<Entry<Integer, String>> set = map.entrySet(); 
		
		// 2. ����Set
		Iterator<Entry<Integer, String>> it = set.iterator();
		
		while(it.hasNext()) {
			// 3. ��ȡ��Set���ϵ�Ԫ�أ���ӳ���ϵ�Ķ���
			Entry<Integer, String> entry = it.next();
			// 4. ͨ��ӳ���ϵ����ķ��� getKey, getValue ��ȡ����ֵ
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
		System.out.println("------");

		for(Entry<Integer, String> entry: map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}
	
}
