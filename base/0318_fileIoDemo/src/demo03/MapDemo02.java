package demo03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map 集合的遍历
 * 	先用键获取值
 * 	Map接口中定义了方法keySet
 * 		将获取的值存储到 Set 集合中再进行遍历
 * Map集合是不可以直接遍历的
 */

public class MapDemo02 {
	public static void main(String[] args) {
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "a");
		_map.put(1, "b");
		_map.put(2, "c");
		_map.put(3, "d");
		_map.put(4, "e");
		// 1. 调用Map的keySet方法将key存储到Set集合中
		Set<Integer> key = _map.keySet();
		// 2.迭代Set中所有的值(key)，Map再根据值(key)获取相对应的值
		Iterator<Integer> it = key.iterator();
		
		for(Integer map_key: key) {
			String map_value = _map.get(map_key);
			System.out.println(map_key + "=" + map_value);
		}
		
		System.out.println("-------------------");
		
		while(it.hasNext()) {
			Integer map_key = it.next();
			String map_value =  _map.get(map_key);
			System.out.println(map_key + "=" + map_value);
		}
	}
}
