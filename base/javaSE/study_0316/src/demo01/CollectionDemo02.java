package demo01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
	public static void main(String[] args) {
		fun();
	}
	
	/*
	 * Collection接口的方法
	 *  void clear()  清空集合当中的所有元素
	 *  
	 * 集合容器依然在
	 */
	public static void fun() {
		// 多态方式调用
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("ghgh");
		coll.add("wewe");
		coll.add("qweq");
		System.out.println(coll);
		// 清空
		coll.clear();
		coll.add("嗯");
		System.out.println(coll);
	}
}
