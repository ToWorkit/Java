package com.itstar.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合中的迭代器
 * 		获取集合中元素的方式
 * 接口Iterator:两个抽象方法
 * 		boolean hasNext() 判断集合中还有没有可被取出的元素，有的话返回true
 * 		next() 取出集合的下一个元素
 * 
 * Collection接口中定义了方法->iterator() 返回的是iterator接口的实现类对象
 * 
 * 使用ArrayList集合对象：
 * 		Iterator it = array.iterator(); 拿到Iterator接口的实现类对象
 *      it是接口的实现类对象,调用了方法hasNext和next()集合元素的迭代
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("aaa1");
		coll.add("aaa2");
		coll.add("aaa3");
		
		Iterator<String> it = coll.iterator();
//		boolean b = it.hasNext();//判断是否有元素
//		Object s = it.next();
//		System.out.println(s);
		
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
	}
}
