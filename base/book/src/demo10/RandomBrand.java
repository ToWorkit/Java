package demo10;

import java.util.ArrayList;
import java.util.Collections;

/*
* 模拟斗地主洗牌和发牌，牌没有排序
* 
* 分析:
* 1,买一副扑克,其实就是自己创建一个集合对象,将扑克牌存储进去
* 2,洗牌
* 3,发牌
* 4,看牌
*/
public class RandomBrand {
	public static void main(String[] args) {
		// 1, 创建集合
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"红桃", "黑桃", "方片", "梅花"};
		// 创建集合
		ArrayList<String> poker = new ArrayList<>();
		
		// 拼接花色和数字
		for(String n: num) {
			for(String c: color) {
				// 连接并添加
				poker.add(n.concat(c));
			}
		}
//		System.out.println(poker);
		// 大小王
		poker.add("大王");
		poker.add("小王");
		// 2, 洗牌 shuffle -> 洗牌(在mapReduce中是 的 map 到 reduce 的过程)
		Collections.shuffle(poker);
		// 3, 发牌
		ArrayList<String> dizhu = new ArrayList<>();
		ArrayList<String> one = new ArrayList<>();
		ArrayList<String> two = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for(int i = 0; i < poker.size(); i++) {
			if (i >= poker.size() - 3) {
				// 底牌
				dipai.add(poker.get(i));
			} else if (i % 3 == 0) {
				one.add(poker.get(i));
			} else if (i % 3 == 1) {
				two.add(poker.get(i));
			} else {
				dizhu.add(poker.get(i));
			}
		}
		
		// 4, 查看
		System.out.println(dizhu);
		System.out.println(one);
		System.out.println(two);
		System.out.println(dipai);
	}
}
