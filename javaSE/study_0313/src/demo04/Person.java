package demo04;

public class Person {
	int a = 1;
	String name;
	int age;
	
	public Person() {
		// ��ʽ���� this()
		// �й��췽�������ҹ��췽������ֵʱ������ѡ���췽��
		a = 8;
		System.out.println("������޲ι��췽��");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("������вι��췽��");
	}
	
}
