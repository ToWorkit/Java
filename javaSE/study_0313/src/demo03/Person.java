package demo03;

public class Person {
	private String name;
	private int age;
	private int id;
	
	// �޲ι��췽��
	public Person() {
		// ��ʽ����Ҫ�ڵ�һ��
		// this("�޲���", 12, 1) -> ����set����
		name = "�޲���";
		age = 12;
		id = 1;
	}
	
	// �в������췽��
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
