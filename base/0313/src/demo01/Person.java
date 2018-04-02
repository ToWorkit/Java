package demo01;

public class Person {
	private String name;
	private int age;
	
	// 创建构造方法 -> 对象初始化(实例化)的时候可以赋值
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 开放私有成员变量
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
	
}
