package com.itstar.demo01;
/*
 * Person���Ĭ�ϼ̳�Object�࣬Person����Object������
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
	 * ��дtoString()����
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
		//�����ж�
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age;
			
		}
		//������Ͳ�ͬ �����Ա�
		return false;
	}
}
