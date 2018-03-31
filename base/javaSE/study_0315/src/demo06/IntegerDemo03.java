package demo06;

/*
 * JDK1.5之后
 * 自动装箱: 基本数据类型，直接变成对象
 * 自动拆箱: 对象中的数据变回基本数据类型
 */

public class IntegerDemo03 {
	public static void main(String[] args) {
		fun();
	}
	
	public static void fun() {
		// 引用类型，引用变量指向对象
		// 自动装箱, 把基本数据类型隐式转为了对象
		Integer i = 5; // -> Integer i = new Integer(5);
		System.out.println(i.toString());
		
		// 引用数据运算，自动拆箱, 将引用类型转为了基本类型
		i += 1;
		System.out.println(i);
	}
}
