package demo09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * * A:Map集合的功能概述
	* a:添加功能
		* V put(K key,V value):添加元素。
			* 如果键是第一次存储，就直接存储元素，返回null
			* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
	* b:删除功能
		* void clear():移除所有的键值对元素
		* V remove(Object key)：根据键删除键值对元素，并把值返回
	* c:判断功能
		* boolean containsKey(Object key)：判断集合是否包含指定的键
		* boolean containsValue(Object value):判断集合是否包含指定的值
		* boolean isEmpty()：判断集合是否为空
	* d:获取功能
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):根据键获取值
		* Set<K> keySet():获取集合中所有键的集合
		* Collection<V> values():获取集合中所有值的集合
	* e:长度功能
		* int size()：返回集合中的键值对的个数
 */

public class map01 {

	public static void main(String[] args) {
		//  key      value
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// 获取集合中的所有值
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());
//		demo01();
		demo02();
	}
	
	
	public static void demo02() {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// 根据键删除元素，返回键对应的值
		Integer value = map.remove("c");
		System.out.println(value);
		
		// 判断是否包含传入的键
		System.out.println(map.containsKey("d"));
		// 判断是否包含传入的值
		System.out.println(map.containsValue(4));
		System.out.println(map);
	}
	
	public static void demo01() {
		Map<String, Integer> map = new HashMap<>();
		Integer i1 = map.put("a", 23);
		Integer i2 = map.put("b", 22);
		Integer i3 = map.put("b", 24);
		Integer i4 = map.put("c", 21);
		Integer i5 = map.put("d", 20);
		Integer i6 = map.put("e", 22);
		System.out.println(map);
		System.out.println(i3);
	}

}
