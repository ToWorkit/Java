package com.itstar.demo06;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean compare(Person p) {
		//p1.age > p2.age ?  this��˭��˭���õľ���˭p1
		return this.age > p.age;
	}
	
}
