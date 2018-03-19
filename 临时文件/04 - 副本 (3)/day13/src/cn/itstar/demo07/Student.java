package cn.itstar.demo07;
/*
 * 问题：static 修饰到底什么时候使用，应用场景
 * 	static 修饰成员变量，修饰成员方法
 * 	成员变量加static ,根据具体事物来具体分析问题
 * 		定义 事物的时候，多个事物之间是否有共性数据
 * 		请你将共性的数据定义为静态的成员变量
 * 	
 *  成员方法加static,跟着变量走
 *  	如果方法，没有调用过非静态成员，将方法定义为静态
 */
public class Student {
	private static String name;
	private static int age;
	
	//是不是静态方法 取决于用的是不是静态变量
	public static void function() {
		System.out.println(age+name);
	}
	
	private char sex;
	//如果用了非静态变量的话 就不能加静态了
	public void function1() {
		System.out.println(age+name+sex);
	}
	
	//这种情况，看方法中有没有用过非静态变量，如果没有用加静态，以便可以直接通过类来调用此方法
	//因为静态先进内存
	public static int getSum(int a,int b,int c) {
		return a+b+c;
	}
}
