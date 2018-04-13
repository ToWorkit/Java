package demo16;

import demo15.Person;

public class Reflect01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class cl_1 = Class.forName("com.demo15.Person");
		Class<Person> cl_2 = Person.class;
		
		Person p = new Person();
		Class cl_3 = p.getClass();
		
		System.out.println(cl_1);
		System.out.println(cl_2);
		System.out.println(cl_3);
	}
}
