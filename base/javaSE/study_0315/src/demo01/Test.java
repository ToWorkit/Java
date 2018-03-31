package demo01;

/**
 * 静态代码块，只执行一次
 * 构造代码块，new一次就执行一次，优先于构造方法
 * 构造方法，new一次就执行一次
 */

public class Test {
	public static void main(String[] args) {
		{
			int a = 1;
			System.out.println(a);
		}
		// 作用域问题，获取不到
		// System.out.println(a);
		
		Person p = new Person("xx", 16);
		Person p1 = new Person("oo", 20);
	}
}
