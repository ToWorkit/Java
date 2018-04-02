package test.demo2;

public class Person {
	// 私有修饰符，只能修饰成员变量
	private String name;
	private int age;
	
	// 对外开放方法，用来访问私有的成员变量
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		String name = "局部变量";
		int age = 20;
		// this指向的是成员变量
		System.out.println(this.name + "-----" + this.age);
	}
}
