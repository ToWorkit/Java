package demo02;

/*
 * LinkedHashSet 基于链表的哈希表的实现
 * 继承自HashSet
 * 
 * LinkedHashSet自身特性： 具有顺序的，存储和取出的顺序相同
 * 线程不安全的集合，运算速度快
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(33);
		link.add(12);
		link.add(13);
		link.add(34);
		link.add(34);
		System.out.println(link);
	}
}
