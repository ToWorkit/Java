package demo01;

public class Person {
	private String name;
	private int age;
	
	// 构造函数方法 -> 实例化时可以直接赋值(不再set)
	// 方法名必须和类保持一致
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 开放私有成员变量的操作入口
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
