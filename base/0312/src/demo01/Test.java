package demo01;

public class Test {
	public static void main(String[] args) {
		// 创建接口的实现类对象
		InterfaceImplements impl = new InterfaceImplements();
		// 调用实现类中的方法
		impl.foo();
		// 加了静态的内容(static)可以直接被类名.调用
		System.out.println(MyInterface.a);
	}
}
