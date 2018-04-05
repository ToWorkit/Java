package demo04;

/**
 * * A:StringBuffer的构造方法：
		* public StringBuffer():无参构造方法
		* public StringBuffer(int capacity):指定容量的字符串缓冲区对象
		* public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
	* B:StringBuffer的方法：
		* public int capacity()：返回当前容量。	理论值
		* public int length():返回长度（字符数）。 实际值
*/

public class StringBuffer01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// 容器中的字符个数，实际值
		System.out.println(sb.length());
		// 容器的初始容量，理论值
		System.out.println(sb.capacity());
		
		System.out.println("-------------------");
		
		StringBuffer sb1 = new StringBuffer(10);
		// 容器中的字符个数，实际值
		System.out.println(sb1.length());
		// 容器的初始容量，理论值
		System.out.println(sb1.capacity());
		
		System.out.println("-------------------");
		
		StringBuffer sb2 = new StringBuffer("Hello");
		// 容器中的字符个数，实际值
		System.out.println(sb2.length());
		// 容器的初始容量，理论值
		System.out.println(sb2.capacity());
	}
}
