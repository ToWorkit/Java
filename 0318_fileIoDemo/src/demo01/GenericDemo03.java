package demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * ���͵�ͨ���
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
	 * ͬʱ�����ڶ�����ϵĵ���
	 * ? ƥ�����е���������
	 */
	public static void _integer(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
