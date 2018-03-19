package demo03;

public class Student {
	// 私有的
	private String name;
	private int age;
	int test = 1;
	
	public static void main(String[] args) {
		fun();
	}
	
	// 静态方法
	public static void fun() {
		// 不允许在静态中调用非静态
		// System.out.println(test);
	}
	
	private static String id;
	private static double price;
	
	// 非静态方法可以用静态成员变量
	// 静态成员变量会先进内存中，可以直接拿来使用
	// 非静态属于对象，需要new之后使用
	public void function() {
		System.out.println(id + "--" + price);
	}
}
