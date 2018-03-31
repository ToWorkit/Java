package demo01;

/*
 * 自动装箱: 基本数据类型变为为对象
 * 
 * 自动拆箱: 对象中的数据变回基本数据类型
 */

public class IntegerDemo01 {
	public static void main(String[] args) {
		fun();
	}
	
	public static void fun() {
		
/*		Integer i = 2;
		// 自动拆箱转为基本数据参与运算
		i = i + 1;
		System.out.println(i); // 3 */
		
		/*
		 * 会出现空指针异常
		 */
		Integer i = null;
		i = i + 1;
		System.out.println(i); // java.lang.NullPointerException
	}
}
