package demo03;

import java.util.LinkedHashMap;

/*
 * LinkedHashMap 继承 HashMap, 保证了迭代的顺序
 */

public class LinkedHashMapDemo01 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> link = new LinkedHashMap<String, String>();
		link.put("0", "a");
		link.put("1", "c");
		link.put("2", "b");
		System.out.println(link);
	}
}
