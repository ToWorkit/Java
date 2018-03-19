package demo05;

/**
 * 抽象类，抽取公共的方法
 * */

public abstract class Employee {
	static String name;
	static String id;
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// 抽象方法，不能有抽象体
	public abstract void work();
}
