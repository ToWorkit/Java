package demo03;

public class Person {
	private String name;
	private int age;
	private int id;
	
	// 无参构造方法
	public Person() {
		// 隐式代码要在第一行
		// this("无参数", 12, 1) -> 操作set方法
		name = "无参数";
		age = 12;
		id = 1;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
