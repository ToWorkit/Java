package com.itstar.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * ���з��͵Ľӿ�
 * 	public interface List<E>{
 * 		abstract boolean add(E a);
 *  }
 *  
 *  ʵ������ʵ�ֽӿ�
 *  public class ArrayList<E> implents List<E>{
 *  
 *  }
 *  
 *  �����ߣ�new ArraList<String>() ���ڵ���ʱ��ָ������
 *  
 *  public class XXX implements List<String>{
 *  
 *  }
 *  new XXX() �����Ļ� ���;�д���� �����Ȳ���ָ��������E����
 */
public class GenericDemo2 {
	/*
	 * ���͵�ͨ���
	 * ��
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
	 * ���巽����ͬʱ������������
	 * �� ƥ��������������
	 */
	public static void iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			//it.next()��ȡԪ��
			System.out.println(it.next());
		}
	}
}
