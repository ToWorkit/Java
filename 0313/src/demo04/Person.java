package demo04;

public class Person {
	int a = 1;
	String name;
	int age;

	public Person() {
		// ��ʽ���� this(4) 
		System.out.println("������޲ι��췽��");
		// ������췽�����б������߹���
		a = 4;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("������вι��췽��");
	}

//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
}

