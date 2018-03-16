package com.itstar.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		//集合可以存储任意类型的对象
		//集合中不指定存储的数据类型
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add(123);
		coll.add("dsadwqqwdqw");
		
		//迭代器的获取
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			//it.next()获取出来的是什么类型？
			//Object obj = it.next();
			//System.out.println(obj);
			
			//转型
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}
