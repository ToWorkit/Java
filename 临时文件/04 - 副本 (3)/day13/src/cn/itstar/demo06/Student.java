package cn.itstar.demo06;
/*
 * 静态的注意事项
 * 
 * 在静态中不能调用非静态
 * 
 * 为什么呢？为什么静态不能调用非静态，生命周期
 * 静态优先与非静态存在于内存当中 
 * 
 * 静态 前人  先人  非静态 后人  不符合逻辑
 * 
 * 注意：静态不能写this，不能写super
 */
public class Student {
	private String name;
	private int age;
	
	/*在静态中不能调用非静态 报错
	 * public static void function() {
		System.out.println(age+name);
	}*/
	
	private static String id;
	private static double price;
	
	//非静态方法可以用静态成员变量 原因静态成员变量先进内存 可以拿来用，非静态属于对象
	public void function() {
		System.out.println(id+price);
		
	}
	
	/*可以直接调用
	 * public static void main() {
		method();
	}
	
	public static void method() {
		
	}*/
	
	/*不可以 如果想用的话 要new对象，用对象来调用
	 * public static void main() {
		method();
	}
	
	public void method() {
		
	}*/
}
