package cn.itstar.demo11;
/*
 * 在bin下 Outer$Inner（这是一个内部类）
 * 	内部类的定义：
 * 		将内部类定义在了外部的成员位置
 * 		类名Outer,内部类名Inner
 *  成员内部类，可以使用成员修饰符,public static ...来修饰
 *  也是个类，可以继承，可以实现接口
 *  
 *  调用规则：内部类，可以使用外部类成员，包括私有
 *  	         外部类要使用内部类的成员，必须建立内部类对象
 */
public class Outer {
	
	private int a = 1;
	//外部类成员位置，定义内部类
	class Inner{
		public void Inner() {
			//内部类可以直接使用外部类的私有成员变量 同级别关系
			System.out.println("内部类的方法inner"+a);
		}
	}
}
