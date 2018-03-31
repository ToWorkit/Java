package demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection是集合所有 实现类 必须拥有的方法
 * 
 * ArrayList implements List
 * List extends Collection
 * 方法的执行，都是实现的重写
 */

public class CollectionDemo01 {
	public static void main(String[] args) {
		fun();
		System.out.println("---------------");
		fun_01();
		System.out.println("---------------");
		fun_02();
	}
	
	/*
	 * boolean remove(Object o) 
	 *  移除集合的指定元素
	 */
	public static void fun() {
		// 多态
		Collection<String> coll = new ArrayList<String>();
		coll.add("a");
		coll.add("b");
		coll.add("c");
		System.out.println(coll);
		// 返回的是boolean值
		System.out.println(coll.remove("b"));
		System.out.println(coll);
	}
	
	/*
	 * Object[] toArray() 集合中的元素，集合转成数组
	 */
	public static void fun_01() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("e");
		coll.add("f");
		coll.add("g");
		// 转为数组，会变为定长
		Object[] objs = coll.toArray();
		// 遍历数组的方式
		for(int i = 0; i < objs.length; i ++) {
			System.out.println(objs[i]);
		}
	}
	
	/*
	 *  boolean contains(Object o) 判断对象是否存在集合中，存在返回true
	 *  参数是Object
	 */
	public static void fun_02() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("e");
		coll.add("f");
		coll.add("g");
		coll.add("100");
		// 类型不同, false
		boolean b = coll.contains(100);
		System.out.println(b);
				
	}
}
