package demo09;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @param args
 * 面试题
 * HashMap和Hashtable的区别
 * 共同点:
 * 底层都是哈希算法,都是双列集合
 * 区别:
 * 1,HashMap是线程不安全的,效率高,JDK1.2版本
 *   Hashtable是线程安全的,效率低,JDK1.0版本的
 * 2,HashMap可以存储null键和null值
 *   Hashtable不可以存储null键和null值
 */

public class HashTable01 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a", 11);
		hm.put(null, 11);
		hm.put("b", null);
		System.out.println(hm);
		
		
		//  java.lang.NullPointerException 不允许存储null值或者键
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("a", 12);
		ht.put(null, 10);
		ht.put("c", null);
		
		System.out.println(ht);
	}
}
