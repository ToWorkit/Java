package demo09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Map集合的第二种迭代,根据键值对对象,获取键和值
 *  A:键值对对象找键和值思路：
	* 获取所有键值对对象的集合
	* 遍历键值对对象的集合，获取到每一个键值对对象
	* 根据键值对对象找键和值
 */
// Map.Entry 说明Entry是Map的内部接口,将键和值封装成了Entry对象,并存储在Set集合中

public class map03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		for(Entry<String, Integer> en: map.entrySet()) {
			System.out.println(en.getKey() + "->" + en.getValue());
		}
	}

}
