package demo03;

import java.util.HashMap;

/*
 * Map集合嵌套集合，Map中存储的还是Map
 */

public class MapMapDemo {
	public static void main(String[] args) {
		// 研发部
		HashMap<Integer, String> develop = new HashMap<Integer, String>();
		// 运营部
		HashMap<Integer, String> operations = new HashMap<Integer, String>();
		
		develop.put(909, "Java");
		develop.put(809, "Python");
		
		operations.put(1010, "小天");
		operations.put(1011, "小穆");
		
		// 公司
		HashMap<String, HashMap<Integer, String>> boos = new HashMap<String, HashMap<Integer, String>>();
		boos.put("研发部", develop);
		boos.put("运营部", operations);
		System.out.println(boos);
	}
}
