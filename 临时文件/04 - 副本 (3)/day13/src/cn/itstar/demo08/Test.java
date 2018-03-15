package cn.itstar.demo08;
/*
 * 多态调用中，编译看谁？运行看谁？
 * 编译都看 = 左边的父类，父类有编译成功，父类没有编译失败
 * 运行，静态方法，运行父类中的静态方法
 * 运行，非静态方法，运行子类的重写方法
 * 成员变量，编译运行全是父类
 */
public class Test {
	public static void main(String[] args) {
		Fu f = new Zi();
		//结果1，看等号左边的父类，对象跟静态没关系。毕竟是父类的引用对象。
		System.out.println(f.a);
		
		//结果是父类的show	
		//调用的还是父类的静态方法，原因：静态属于类，不属于对象
		//对象的多态性，静态和对象无关，父类的引用.静态方法
		f.show();
	}
}
