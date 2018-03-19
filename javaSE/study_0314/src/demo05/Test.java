package demo05;

public class Test {
	public static void main(String[] args) {
		// 正常实例化
		Person p = new Person();
		p.eat();
		
		// 匿名写法
		new Person().eat();
		// 可以多次
		new Person().eat();
		
		// 匿名对象作为参数传递
		method(new Person());
	}

	public static void method(Person p) {
		p.eat();
	}
}
