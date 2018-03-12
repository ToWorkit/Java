package com.itstar.demo06;

public class TestPerson {
	public static void main(String[] args) {
		//测试Person类中的年龄比较功能
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setAge(10);
		p2.setAge(12);
		
		boolean b = p1.compare(p2);
		System.out.println(b);
	}
}
