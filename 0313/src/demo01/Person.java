package demo01;

public class Person {
	private String name;
	private int age;
	
	// �������췽�� -> �����ʼ��(ʵ����)��ʱ����Ը�ֵ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ����˽�г�Ա����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
