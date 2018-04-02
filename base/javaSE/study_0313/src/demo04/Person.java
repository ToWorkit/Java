package demo04;

public class Person {
	int a = 1;
	String name;
	int age;
	
	public Person() {
		// 隐式代码 this()
		// 有构造方法，并且构造方法中有值时，优先选择构造方法
		a = 8;
		System.out.println("父类的无参构造方法");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("父类的有参构造方法");
	}
	
}
