package demo04;

public class Person {
	int a = 1;
	String name;
	int age;

	public Person() {
		// 隐式代码 this(4) 
		System.out.println("父类的无参构造方法");
		// 如果构造方法中有变量，走构造
		a = 4;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("父类的有参构造方法");
	}

//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
}

