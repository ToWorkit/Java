package demo09;

import java.util.HashMap;

/*
 * 集合嵌套之HashMap嵌套HashMap
 */

public class HashMapTwo {
	public static void main(String[] args) {
		// 一班
		HashMap<Student, String> one = new HashMap<>();
		one.put(new Student("a", 12), "嗯嗯");
		one.put(new Student("d", 11), "嗯嗯");
		one.put(new Student("c", 11), "嗯嗯");
		one.put(new Student("b", 10), "嗯嗯");
		
		// 二班
		HashMap<Student, String> two = new HashMap<>();
		two.put(new Student("e", 21), "好啊");
		two.put(new Student("f", 20), "好啊"); 
		two.put(new Student("h", 23), "好啊"); 
		two.put(new Student("g", 19), "好啊"); 
		
		// 定义年级(多集合)
		HashMap<HashMap<Student, String>, String> con = new HashMap<>();
		con.put(one, "一班");
		con.put(two, "二班");
/*		{
			{
				Student [namea, age=12]=嗯嗯, 
				Student [namec, age=11]=嗯嗯, 
				Student [nameb, age=10]=嗯嗯, 
				Student [named, age=11]=嗯嗯
			}=一班, 
			{
				Student [namee, age=21]=好啊, 
				Student [nameh, age=23]=好啊, 
				Student [namef, age=20]=好啊, 
				Student [nameg, age=19]=好啊
			}=二班
		}*/
//		System.out.println(con);
		
		// 遍历双列集合
		// keySet -> 双列集合中键的集合
		for(HashMap<Student, String> k: con.keySet()) {
			// con.get(k) -> 根据键对象获取值对象
			String value = con.get(k);
			// 遍历键的双列集合对象
			// k.keySet() -> 获取集合总所有的学生键对象
			for(Student key: k.keySet()) {
				String value2 = k.get(key);
				System.out.println(key + "=" + value2 + "=" + value);
			}
		}
	}
}
