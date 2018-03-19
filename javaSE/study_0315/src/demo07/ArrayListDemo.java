package demo07;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * 储存int类型的数据
		 * 集合本身不接受基本数据类型
		 * 发生了自动装箱进行存储
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		// 自动装箱
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		System.out.println(array.size());
		System.out.println(array.get(0));
		for (int i: array) {
			System.out.println(i);
		}
	}
}
