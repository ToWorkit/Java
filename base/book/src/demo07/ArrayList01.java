package demo07;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
 *  思路：创建新集合方式
 */

public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("d");
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	

	/*
	 * 创建新集合将重复元素去掉
	 * 1,明确返回值类型,返回ArrayList
	 * 2,明确参数列表ArrayList
	 * 
	 * 分析:
	 * 1,创建新集合
	 * 2,根据传入的集合(老集合)获取迭代器
	 * 3,遍历老集合
	 * 4,通过新集合判断是否包含老集合中的元素,如果包含就不添加,如果不包含就添加
	 */
	public static ArrayList  getSingle(ArrayList list) {
		// 1 创建新集合
		ArrayList newList = new ArrayList<>();
		// 2 根据传入的集合获取迭代器
		Iterator it = list.iterator();
		
		// 3 遍历传入的集合
		while(it.hasNext()) {
			// 记录每一个元素
			Object obj = it.next();
			
			// 创建的新集合中没有包含传入集合中的元素则添加
			if(!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		
		// 返回处理好的集合
		return newList;
	}
}
