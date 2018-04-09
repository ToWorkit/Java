package demo09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 双列集合迭代
 */

public class map02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// 根据键获取值
/*		Integer i = map.get("a");
		System.out.println(i);*/
		
		// 获取所有的键的集合
		Set<String> keySet = map.keySet();
		// 获取迭代器
		Iterator<String> it = keySet.iterator();
		// 判断集合中是否有元素
		while(it.hasNext()) {
			// 获取每一个键
			String key = it.next();
			// 根据键获取值
			Integer value = map.get(key);
			System.out.println(key + "->" + value);
		}
		
		System.out.println("---------------");
		// 使用增强for循环遍历
		for(String key: map.keySet()) {
			System.out.println(key + "->" + map.get(key));
		}
	}
}
