package demo03;

import java.util.LinkedHashMap;

/*
 * LinkedHashMap �̳� HashMap, ��֤�˵�����˳��
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
