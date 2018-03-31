package test.demo2;

public class Person_01Test {
	public static void main(String[] args) {
		// 创建Person_o1的变量(实例化)
		Person_01 p_01 = new Person_01();
		Person_01 p_02 = new Person_01();
		
		p_01.setAge(20);
		p_02.setAge(10);
		
		boolean b = p_01.compare(p_02);
		// p_01.age > p_02.age => true
		// 谁调用this，this就指谁
		System.out.println(b);
	}
}
