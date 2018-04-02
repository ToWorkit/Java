package demo06;

public class IntegerDemo04 {
	public static void main(String[] args) {
		fun();
	}
	public static void fun() {
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		
		// 引用类型比较的是地址 false
		System.out.println(a == b);
		// equals比较的是对象的数据(值)
		// 继承了Object类，重写了equals方法
		// true
		System.out.println(a.equals(b));
		
		System.out.println("-------------");
		
		// false 
		// 发生了自动装箱，基本数据类型包装成了引用数据类型
		// 比较的是地址
		Integer l = 300;
		Integer p = 300;
		System.err.println(l == p);

		System.out.println("==================");
		
		// 注意点，数据在byte范围(-128 ~ 127)内时，JVM不会重新new对象
		Integer c = 127;
		Integer d = 127;
		// 比较的是值(基本数据类型)
		System.out.println(c == d);
	}
}
