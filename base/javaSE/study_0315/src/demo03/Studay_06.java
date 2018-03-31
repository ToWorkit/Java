package demo03;

public class Studay_06 {
	public static void main(String[] args) {
		fun();
		fun_01();
	}
	
	/**
	 * boolean endsWith(String suffix)
	 *  测试此字符串是否以指定的后缀结束
	 */
	public static void fun() {
		String s = "test";
		boolean b = s.endsWith("s");
		System.out.println(b);
	}
	
	/**
	 * String substring(int beginIndex, int endIndex) 
	 * 	返回一个新字符串，
	 *  含头不含尾
	 *  
	 * String substring(int beginIndex) 
	 * 	含头到尾
	 */
	public static void fun_01() {
		String s = "Hello World";
		String s_1 = s.substring(1, 4);
		System.out.println(s_1);
		String s_2 = s.substring(4);
		System.out.println(s_2);
	}
}
