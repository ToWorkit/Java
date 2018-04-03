package demo02;

/*
 * 内部类
 * 	访问
 * 		内部类可以直接访问外部类的成员，包括私有
 * 		外部类要访问内部类的成员，必须创建对象
 * 		外部类名.内部类名 对象名 = 外部类对象.内部类对象
 */

public class InnerClass01 {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.method();
	}
}

class Outer {
	private int num = 10;
	class Inner {
		public void method() {
			System.out.println(num + 1);
		}
	}
}
