package test.demo2;

public class Person_01Test {
	public static void main(String[] args) {
		// ����Person_o1�ı���(ʵ����)
		Person_01 p_01 = new Person_01();
		Person_01 p_02 = new Person_01();
		
		p_01.setAge(20);
		p_02.setAge(10);
		
		boolean b = p_01.compare(p_02);
		// p_01.age > p_02.age => true
		// ˭����this��this��ָ˭
		System.out.println(b);
	}
}
