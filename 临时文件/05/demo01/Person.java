package com.itstar.demo01;
/*
 * Person类会默认继承Object类，Person就是Object类子类
 */
public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
		
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * 重写toString()方法
	 */
	public String toString() {
		return name +"...."+ age;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		//进行判断
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age;
			
		}
		//如果类型不同 不做对比
		return false;
	}
}
