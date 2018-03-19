package demo03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map 集合获取方式
 * 	entrySet 方式，键值对映射关系获取
 * 1. 调用Map集合 Entry内部类的 方法entrySet()， 将集合的映射关系对象存储到set集合 Set<Map.Entry<key, value>> 集合的嵌套
 * 2. 迭代Set集合
 * 3. 获取处Set集合的元素，是映射关系对象
 * 4. 通过映射关系对象方法getKey, getValue获取键值对
 */

public class MapDemo03 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "a");
		map.put(1, "b");
		map.put(2, "c");
		map.put(3, "d");
		map.put(4, "e");
		
		// 1. 调用集合的 entrySet方法将集合的映射关系存储到Set集合中 Set<Map.Entry<key, value>> 集合嵌套
		// 类似于内部类和外部类的关系，通过外部类的类名 Map 来调用内部类 Entry -> Map.Entry
		Set<Entry<Integer, String>> set = map.entrySet(); 
		
		// 2. 迭代Set
		Iterator<Entry<Integer, String>> it = set.iterator();
		
		while(it.hasNext()) {
			// 3. 获取到Set集合的元素，是映射关系的对象
			Entry<Integer, String> entry = it.next();
			// 4. 通过映射关系对象的方法 getKey, getValue 获取建和值
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
