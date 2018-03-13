package com.itstar.demo07;

public class Test {
	public static void main(String[] args) {
		//创建对象 同时指定姓名和年龄
		Worker w = new Worker("喜洋洋",18);
		System.out.println(w.getName());
		System.out.println(w.getAge());
		
		Student s = new Student("小灰灰",2);
		System.out.println(s.getAge());
		System.out.println(s.getName());
	}
}
