package demo02;


/**
 * ���췽���������������һ��
 * */

public class Person {
	private String name;
	private int age;
	
	// �޲ι��췽��
	public Person() {
		// set ����
	}
	
	// �вι��췽��
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.err.println("����"); �޲ι��췽����������вι��췽��
	}

	// ���ž�̬��Ա����
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
