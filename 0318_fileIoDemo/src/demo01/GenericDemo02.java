package demo01;

import java.util.ArrayList;

/*
 * ArrayList 集合自己的方法
 */

public class GenericDemo02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		// 自动装箱，int 类型 转为 Integer 对象
		arr.add(123);
		arr.add(234);
		System.out.println("集合取值 get(index)" + arr.get(0));
		// 集合变为数组
//		Integer[] i = new Integer[arr.size()];
//		Integer[] list = arr.toArray(i);
		Integer[] list = arr.toArray(new Integer[arr.size()]);
		System.out.println("数组取值 [index]" + list[1]);
		for(Integer j : list) {
			System.out.println(j);
		}
	}
}
