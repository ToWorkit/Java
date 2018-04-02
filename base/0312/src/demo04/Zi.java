package demo04;

public class Zi extends Fu{
	int a = 2;
	public void show() {
		System.out.println("子类的方法");
	}
	
	// 添加静态方法，使其可以被静态引用(类名.方法名)
	public static void only() {
		System.out.println("子类独有");
	}
}
