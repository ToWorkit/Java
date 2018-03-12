package com.itstar.demo05;
/*
 * 测试类
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		//调用set方法，对成员变量赋值
		p.setAge(18);
		p.setName("詹姆斯");
		p.speak();
		//System.out.println(p);
	}
}
