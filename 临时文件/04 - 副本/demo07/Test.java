package com.itstar.demo07;

public class Test {
	public static void main(String[] args) {
		//�������� ͬʱָ������������
		Worker w = new Worker("ϲ����",18);
		System.out.println(w.getName());
		System.out.println(w.getAge());
		
		Student s = new Student("С�һ�",2);
		System.out.println(s.getAge());
		System.out.println(s.getName());
	}
}
