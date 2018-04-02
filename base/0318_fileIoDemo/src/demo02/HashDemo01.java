package demo02;

import java.util.HashSet;

public class HashDemo01 {
	public static void main(String[] args) {
/*		Person01.id = 1;
		System.out.println(Person01.id);*/
		// 同级目录不需要引包
		HashSet<Person01> p = new HashSet<Person01>();
		// 构造方法传参
		p.add(new Person01("a", 21));
		// 判断对象是否重复 hashCode, equals
		p.add(new Person01("a", 21));
		p.add(new Person01("b", 11));
		p.add(new Person01("c", 22));
		p.add(new Person01("d", 31));
		// 因为是 new 的对象(实例化)所以存储的是地址，不重复，导致有相同的值
		// 重写toString
		System.out.println(p.toString());
	}
}
