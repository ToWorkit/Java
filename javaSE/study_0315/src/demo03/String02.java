package demo03;

public class String02 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1);
		System.out.println(s2);
		
		// 引用数据类型，比较的是内存地址
		System.out.println(s1 == s2);
		// String 类中重写了 equals 方法
		// 拆开对每个值进行挨个比较
		System.out.println(s1.equals(s2));
	}
}
