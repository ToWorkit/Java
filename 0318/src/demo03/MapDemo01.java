package demo03;

import java.util.HashMap;
import java.util.Map;

/*
 * Map 接口中常用的方法
 * 	需要使用Map接口的实现类HashMap 
 * 	key 唯一
 */

public class MapDemo01 {
	public static void main(String[] args) {
//		fun();
//		fun_01();
		fun_02();
	}
	
	/*
	 * V remove(Object key) 移除集合中的键值对
	 */
	public static void fun() {
		// key, value
		// 实现类HashMap
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "x");
		_map.put(1, "a");
		_map.put(2, "b");
		_map.put(3, "c");
		// {0=x, 1=a, 2=b, 3=c}
		System.out.println(_map);
		
		// 通过键移除
		String st = _map.remove(2);
		// 返回移除的键对应的值
		// b
		System.out.println(st);
		// {0=x, 1=a, 3=c}
		System.out.println(_map);
	}
	
	/*
	 * V get(Object key) 同过键对象获取值
	 */
	public static void fun_01() {
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "q");
		_map.put(1, "w");
		_map.put(2, "e");
		_map.put(3, "r");
		
		// 通过键获取值
		String s = _map.get(2);
		// e
		System.out.println(s);
	}
	
	/*
	 * 键是唯一的，重复赋值时后面的值会覆盖前面的
	 */
	public static void fun_02() {
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "p");
		_map.put(1, "i");
		_map.put(2, "t");
		// 会覆盖上面的
		_map.put(0, "l");
		// {0=l, 1=i, 2=t}
		System.out.println(_map);
	}
}
