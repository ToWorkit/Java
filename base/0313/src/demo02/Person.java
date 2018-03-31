package demo02;


/**
 * 构造方法名必须和类名称一致
 * */

public class Person {
	private String name;
	private int age;
	
	// 无参构造方法
	public Person() {
		// set 操作
	}
	
	// 有参构造方法
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.err.println("测试"); 无参构造方法不会调用有参构造方法
	}

	// 开放静态成员访问
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
