/*
 * java -D 命令行获取参数值
 * java -Dname=Tom -Dage=24 System_fun01
 */

public class System_fun01 {
	public static void main(String[] args) {
		test();
	}
	private static void test() {
		String name = System.getProperty("name");
		String age = System.getProperty("age");
		System.out.println(name + "\t" + age);
	}
}
