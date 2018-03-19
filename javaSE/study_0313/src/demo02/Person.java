package demo02;

public class Person {
	private String name;
	private int age;
	
	// 无参数构造方法
	public Person() {
		// 隐式代码
//		this(name, set) -> set
	}
	
	// 有参数构造方法
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
