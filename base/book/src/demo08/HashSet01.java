package demo08;

import java.util.HashSet;

import demo07.Person;

public class HashSet01 {
	/*
	 * 每实例化一次放入的地址都不同
	 */
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("小明", 23));
		hs.add(new Person("小明", 23));
		hs.add(new Person("小明", 23));
		hs.add(new Person("小红", 20));
		hs.add(new Person("小明", 23));
		System.out.println(hs);
	}
}
