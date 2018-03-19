package demo06;

public class IntegerDemo01 {
	public static void main(String[] args) {
		fun();
		fun01();
		fun02();
	}
	
	/*
	 * Integer类当中的方法：parseInt(String s) 
	 * 返回值int(基本数据类型)
	 * 要求：字符串必须是数字格式的
	 * */
	public static void fun() {
		int a = Integer.parseInt("20");
		System.out.println(a + 1);
	}
	
	/*
	 * parseInt(String s, int radix)
	 * radix:基数 进制
	 * parseInt:运行结果是十进制
	 */
	public static void fun01() {
		int a = Integer.parseInt("A", 16);
		System.out.println(a);
	}
	
	/*
	 * Integer 类的构造方法
	 * 	Integer(String s) 
	 * 将数字格式的字符串传递到Integer的构造方法中
	 */
	public static void fun02() {
		Integer in = new Integer(5);
		int i = in.intValue();
		System.out.println(++i);
	}
	
	
}
