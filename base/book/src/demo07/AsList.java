package demo07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		
//		demo01();
		demo02();
		
/*		// 集合转换数组时，数组长度如果是小于等于集合的size时，转换后的数组长度等于集合的size
		// 数组的长度大于size，则分配的数组长度就和指定的长度一样
		String[] arr = list.toArray(new String[10]);
		for(String string: arr) {
			b
			c
			c
			d
			null
			null
			null
			null
			null
			System.out.println(string);
		}*/
	}
	
	public static void demo02() {
/*		int[] arr = {1, 2, 3, 4, 5};
		// 基本数据类型的数组转换成集合，会将整个数组当作一个对象转换
		List<int[]> list = Arrays.asList(arr);*/
		
		// 数组转成集合时，必须是引用数据类型
		Integer[] arr = {1, 2, 3, 4, 5};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list); //  [1, 2, 3, 4, 5]
	}
	
	public static void demo01() {
		String[] arr = {"a", "b", "c"};
		List<String> list = Arrays.asList(arr);
		// Exception in thread "main" java.lang.UnsupportedOperationException
		// 不支持添加操作
//		list.add("d");
		System.out.println(list);
	}
}
