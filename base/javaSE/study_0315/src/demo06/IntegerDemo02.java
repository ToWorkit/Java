package demo06;

public class IntegerDemo02 {
	public static void main(String[] args) {
		fun();
		fun_0();
	}
	/*
	 * Integer类的其它方法
	 *  包含了3个方法和2个静态成员变量
	 *  
	 *  方法：
	 *  	十进制转换为二进制toBinarString(int)
	 *  	十进制转换为八进制toOctalString(int)
	 *  	十进制转换为十六进制toHexString(int)
	 *  三个方法返回值都是以String类型返回
	 */
	public static void fun() {
		//转换成二进制
		System.out.println(Integer.toBinaryString(99));
		//转换为八进制
		System.out.println(Integer.toOctalString(99));
		//转换为十六进制
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 * Integer类的静态成员变量
	 * 	MAX_VALE
	 *  MIN_VALUE
	 */
	public static void fun_0() {
		//最大值 和最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
