package hdfs01;

/*
 * java -D �����л�ȡ����ֵ
 * java -Dname=Tom -Dage=24 System_fun01
 */

public class System_fun01 {
	public static void main(String[] args) {
		
	}
	private static void test() {
		String name = System.getProperty("name");
		String age = System.getProperty("age");
		System.out.println(name + "\t" + age);
	}
}