package demo01;

public class Reflect01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c_1 = Class.forName("com.demo01.Person");
		Class c_2 = Person.class;
		
		Person p = new Person();
		Class c_3 = p.getClass();
		p.eat();
		
		System.out.println(c_1);
		System.out.println(c_2);
		System.out.println(c_3);
	}
}
