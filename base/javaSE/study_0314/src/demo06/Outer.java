package demo06;

/**
 * 内部类
 * 	将内部类定义在外部的成员位置
 * 	同样可以继承，实现接口
 * 调用规则
 * 	内部类可以使用外部类成员，包括私有
 * 	外部类要使用内部类的成员，必须建立内部类对象
 */

public class Outer {
	private int a = 1;
	// 外部类成员位置，定义内部类
	class Inner {
		int a = 2;
		// 构造方法
		public void Inner() {
			int a = 3;
			// 3 -> 就近原则
			// 内部类可以直接使用外部类的私有成员变量 属于同一级别关系
			System.out.println("内部类的方法Inner" + a);
			
			// 调用者
			System.out.println("调用者 " + this.a);
			
			// 外部类 
			System.out.println("外部类 " + Outer.this.a);
			
		}
	}
}
