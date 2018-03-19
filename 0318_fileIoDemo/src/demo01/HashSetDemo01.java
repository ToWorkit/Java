package demo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set接口，特点：不重复元素，没索引
 * 
 * Set接口的实现类：HashSet(哈希表)
 * 特点：无序集合，存储和取出元素的顺序不同，没有索引，不存储重复元素
 * 
 */

public class HashSetDemo01 {
	public static void main(String[] args) {
		// Set接口的实现类
		Set<String> s = new HashSet<String>();
		s.add("a");
		s.add("a");
		s.add("b");
		s.add("d");
		s.add("c");
		
		// 迭代
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------");
		
		// for
		for(String si: s) {
			System.out.println(si);
		}
		
		String str = new String("abc");
		// 源码中的 hashCode算法
/*	   public int hashCode() {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = value;

	            for (int i = 0; i < value.length; i++) {
	                h = 31 * h + val[i];
	            }
	            hash = h;
	        }
	        return h;
	    }*/
		// 96354
		System.out.println(str.hashCode());
	}
}
