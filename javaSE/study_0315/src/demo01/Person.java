package demo01;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("有参构造方法");
	}
	
	// 构造代码块
	{
		System.out.println("构造代码块");
	}
	
	// 静态代码块, 只会执行一次
	static {
		System.out.println("静态代码块");
	}
}
