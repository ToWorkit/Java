package demo09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ˫�м��ϵ���
 */

public class map02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// ���ݼ���ȡֵ
/*		Integer i = map.get("a");
		System.out.println(i);*/
		
		// ��ȡ���еļ��ļ���
		Set<String> keySet = map.keySet();
		// ��ȡ������
		Iterator<String> it = keySet.iterator();
		// �жϼ������Ƿ���Ԫ��
		while(it.hasNext()) {
			// ��ȡÿһ����
			String key = it.next();
			// ���ݼ���ȡֵ
			Integer value = map.get(key);
			System.out.println(key + "->" + value);
		}
		
		System.out.println("---------------");
		// ʹ����ǿforѭ������
		for(String key: map.keySet()) {
			System.out.println(key + "->" + map.get(key));
		}
	}
}
