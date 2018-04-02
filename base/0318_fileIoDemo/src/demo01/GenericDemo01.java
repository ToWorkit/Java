package demo01;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;


/*
 * JDK1.5之后出现的安全机制，保证程序的安全性
 * 		泛型：指明集合存储元素的类型 <类型>
 */

public class GenericDemo01 {
	public static void main(String[] args) {
		fun_01();
	}
	
	public static void fun() {
		// 加泛型是为了保证程序的安全性，只允许添加String类型
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("bgc");
		// 不允许
//		coll.add(123);
		
	}
	
	public static void fun_01() {
		Collection coll = new ArrayList<>();
		coll.add("lo");
		coll.add("pl");
		// 自动装箱，将int类型转为了Integer对象
		coll.add(123);
		
		Iterator i = coll.iterator();
		
		// 判断是否有下一个元素
/*		while(i.hasNext()) {
			// 123 此时为 Integer对象，是不能使用 String 强转的, toString可以， 第二次写的时候补全为什么
			String s = i.next().toString();
			System.out.println(s);
		}*/
		
		
		// 判断是否有下一个元素
		while(i.hasNext()) {
//			System.out.println(i.next());
			// 123 此时为 Integer对象，是不能使用 String 强转的
			String s = (String)i.next();
			System.out.println(s);
		}
	}
}
