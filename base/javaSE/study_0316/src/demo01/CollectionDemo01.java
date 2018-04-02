package demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection�Ǽ������� ʵ���� ����ӵ�еķ���
 * 
 * ArrayList implements List
 * List extends Collection
 * ������ִ�У�����ʵ�ֵ���д
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
	 *  �Ƴ����ϵ�ָ��Ԫ��
	 */
	public static void fun() {
		// ��̬
		Collection<String> coll = new ArrayList<String>();
		coll.add("a");
		coll.add("b");
		coll.add("c");
		System.out.println(coll);
		// ���ص���booleanֵ
		System.out.println(coll.remove("b"));
		System.out.println(coll);
	}
	
	/*
	 * Object[] toArray() �����е�Ԫ�أ�����ת������
	 */
	public static void fun_01() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("e");
		coll.add("f");
		coll.add("g");
		// תΪ���飬���Ϊ����
		Object[] objs = coll.toArray();
		// ��������ķ�ʽ
		for(int i = 0; i < objs.length; i ++) {
			System.out.println(objs[i]);
		}
	}
	
	/*
	 *  boolean contains(Object o) �ж϶����Ƿ���ڼ����У����ڷ���true
	 *  ������Object
	 */
	public static void fun_02() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("e");
		coll.add("f");
		coll.add("g");
		coll.add("100");
		// ���Ͳ�ͬ, false
		boolean b = coll.contains(100);
		System.out.println(b);
				
	}
}
