package demo08;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *  需求:将集合中的重复元素去掉
 *  
 *  分析:
 *  1,创建List集合存储若干个重复元素
 *  2,单独定义方法去除重复
 *  3,打印一下List集合
 */

public class List01 {
	public static void main(String[] args) {
		// 含有重复元素的集合
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		// 单独定义方法去重
		getSingle(list);
		
		System.out.println(list);
	}
	
	/*
	 * 分析 -> 作中转
	 * 去除List集合中的重复元素
	 * 1,创建一个LinkedHashSet集合
	 * 2,将List集合中所有的元素添加到LinkedHashSet集合
	 * 3,将list集合中的元素清除
	 * 4,将LinkedHashSet集合中的元素添加回List集合中
	 */
	public static void getSingle(List<String> list) {
		// 创建LinkedHashSet集合
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		// 将List集合中的所有元素添加到LinkedHashSet中去
		lhs.addAll(list);
		// 清空list集合
		list.clear();
		// 将去重后的数据重新放入
		list.addAll(lhs);
	}
}
