package com.itstar.demo03;

public class PersonTest {
	public static void main(String[] args) {
		int a = 1;
		function(a);
		System.out.println(a);//1
	}
	
	public static void function(Person p) {
		p.name = "ÀîËÄ";
		
	}
	
	public static void function(int a) {
		a += 3;
	}
}
