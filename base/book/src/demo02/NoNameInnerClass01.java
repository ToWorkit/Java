package demo02;

/*
 * 匿名内部类
 * 	内部类的简化写法
 * 前提: 存在一个类或者接口
 * 	类可以是具体类也可以是抽象类
 * 格式
 * 	new 类名或者接口名() {
 * 		重写方法;
 * 	}
 * 本质
 * 	一个继承了该类或者是实现了该接口的子类匿名对象
 * 	
 */

public class NoNameInnerClass01 {
	public static void main(String[] args) {
		Outer_05 o = new Outer_05();
		o.method();
		
		// 匿名类传入
		o.method_01(new Person() {
			public void show() {
				System.out.println("匿名类作为参数");
			}
		});
	}
}

// 接口
interface Inter {
	public void print();
}


// 抽象类(接口也是一样的)
abstract class Person {
	public abstract void show();
}

// 类 
class Outer_05 {
	// 实现接口
	class Inner implements Inter {

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("实现了Inter接口并重写了print方法");
		}
	}
	
	public void method() {
		
		Inner i = new Inner();
		i.print();
		
		// 匿名内部类
		// 实现了Inter接口
		Inter it = new Inter() {
			@Override
			public void print() {
				// TODO Auto-generated method stub	
				System.out.println("匿名内部类的print方法");
			}
		};
		// 有多个方法时使用
		it.print();
	}
	
	// 以参数形式传入
	public void method_01(Person p) {
		p.show();
	}
}
