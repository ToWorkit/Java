package demo03;

public class Person {
	// 特有数据只能通过new对象调用
	String name;
	// 共享数据，可以通过 类名. 调用，也可以通过new对象调用
	static String className;
}
