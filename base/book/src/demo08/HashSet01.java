package demo08;

import java.util.HashSet;

import demo07.Person;

public class HashSet01 {
	/*
	 * ÿʵ����һ�η���ĵ�ַ����ͬ
	 */
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("С��", 23));
		hs.add(new Person("С��", 23));
		hs.add(new Person("С��", 23));
		hs.add(new Person("С��", 20));
		hs.add(new Person("С��", 23));
		System.out.println(hs);
	}
}
