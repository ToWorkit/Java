package demo01;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("�вι��췽��");
	}
	
	// ��������
	{
		System.out.println("��������");
	}
	
	// ��̬�����, ֻ��ִ��һ��
	static {
		System.out.println("��̬�����");
	}
}
