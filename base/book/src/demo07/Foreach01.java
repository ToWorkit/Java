package demo07;

import java.util.ArrayList;
import java.util.Iterator;

public class Foreach01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		
/*		// 普通的for循环删除元素
		for(int i = 0; i < list.size(); i++) {
			// list.get(i) -> 普通for循环取值
			if ("c".equals(list.get(i))) {
				list.remove(i--);
			}
		}
		System.out.println(list); // [a, b, d]
*/	
		
/*		// 迭代的形式
		for(Iterator<String> it = list.iterator(); it.hasNext();) {
			// it.next() -> 迭代取值
			if ("d".equals(it.next())) {
				// 不能使用集合的删除方法，因为迭代过程中如果集合修改会出现修改异常
				list.remove("d");
			}
		}
		// Exception in thread "main" java.util.ConcurrentModificationException
		System.out.println(list);*/
		
		for(String string: list) {
			if ("b".equals(string)) {
				// 同样不可以删除，只能遍历
				list.remove("b");
			}
		}
		// Exception in thread "main" java.util.ConcurrentModificationException
		System.out.println(list);
	}
}
