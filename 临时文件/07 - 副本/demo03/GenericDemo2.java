package com.itstar.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 带有泛型的接口
 * 	public interface List<E>{
 * 		abstract boolean add(E a);
 *  }
 *  
 *  实现类来实现接口
 *  public class ArrayList<E> implents List<E>{
 *  
 *  }
 *  
 *  调用者：new ArraList<String>() 后期调用时再指定泛型
 *  
 *  public class XXX implements List<String>{
 *  
 *  }
 *  new XXX() 这样的话 类型就写死了 可以先不用指定泛型用E代替
 */
public class GenericDemo2 {
	/*
	 * 泛型的通配符
	 * ？
	 */
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		array.add("123");
		array.add("345");
		
		set.add(7777);
		set.add(6666);
		
		iterator(array);
		iterator(set);
		
	}
	/*
	 * 定义方法，同时迭代两个集合
	 * ？ 匹配所有数据类型
	 */
	public static void iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			//it.next()获取元素
			System.out.println(it.next());
		}
	}
}
