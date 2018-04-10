package demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
 * 
 *  分析:
 * 1,买一副扑克,其实就是自己创建一个集合对象,将扑克牌存储进去
 * 2,洗牌
 * 3,发牌
 * 4,看牌
 */

public class RandomBrand02 {
	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		// 存储索引和扑克牌
		HashMap<Integer, String> hm = new HashMap<>();
		// 存储索引
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		
		// 拼接扑克牌并将索引和扑克牌存储在hm中
		// 获取数字
		for (String s1: num) {
			// 获取花色
			for (String s2: color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				// 将索引 0 到 51 添加到list集合中
				index++;
			}
		}
		// 小王添加至双列集合中
		hm.put(index, "小王");
		list.add(index);
		
		// 大王
		index++;
		hm.put(index, "大王");
		list.add(index);
		
		// 洗牌
		Collections.shuffle(list);
		// 发牌
		TreeSet<Integer> one = new TreeSet<>();
		TreeSet<Integer> two = new TreeSet<>();
		TreeSet<Integer> dizhu = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for (int i = 0; i < list.size(); i ++) {
			if (i >= list.size() - 3) {
				dipai.add(list.get(i));
			} else if (i % 3 == 0) {
				one.add(list.get(i));
			} else if (i % 3 == 1) {
				two.add(list.get(i));
			} else {
				dizhu.add(list.get(i));
			}
		}
		
		// 查看
		lookPoker(hm, dizhu, "地主");
	}
	
	public static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name);
		for(Integer i: ts) {
			// i 代表双列集合中的每一个键
			System.out.println(hm.get(i));
		}
	}
}
