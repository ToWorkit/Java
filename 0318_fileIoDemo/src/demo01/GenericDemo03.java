package demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 泛型的通配符
 */

public class GenericDemo03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		HashSet<Integer> arr_set = new HashSet<Integer>();
		
		arr.add("ad");
		arr.add("bf");
		
		arr_set.add(123);
		arr_set.add(235);
		
		_integer(arr);
		_integer(arr_set);
		
	}
	
	/*
	 * 同时适用于多个集合的迭代
	 * ? 匹配所有的数据类型
	 */
	public static void _integer(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
