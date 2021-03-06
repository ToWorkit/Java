package demo10;

import java.util.HashMap;

/**
 * * A:案例演示
 * 需求：统计字符串中每个字符出现的次数
 * 
 * 分析:
 * 1,定义一个需要被统计字符的字符串
 * 2,将字符串转换为字符数组
 * 3,定义双列集合,存储字符串中字符以及字符出现的次数
 * 4,遍历字符数组获取每一个字符,并将字符存储在双列集合中
 * 5,存储过程中要做判断,如果集合中不包含这个键,就将该字符当作键,值为1存储,如果集合中包含这个键,就将值加1存储
 * 6,打印双列集合获取字符出现的次数
 */

public class WordCount01 {
	public static void main(String[] args) {
		// 1, 统计的字符串
		String s = "aaacccsssww";
		// 2, 将字符串转为字符数组
		char[] arr = s.toCharArray();
		// 3, 定义双列集合，存储字符串中字符以及字符出现的次数
		HashMap<Character, Integer> hm = new HashMap<>();
		// 4, 遍历字符数组获取每一个字符，并将字符存储在双列集合中
		for(char c: arr) {
			// 5 判断，没有则赋值为1，有则加1
			// 布尔值 System.out.println(hm.containsKey(c));
			hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
		}
		System.out.println(hm.keySet());
		// 6, 遍历打印双列集合获取字符出现的次数
		// hm.keySet() -> 键集合
		for(Character key: hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
