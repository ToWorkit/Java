package test.demo2;

public class Person {
	// ˽�����η���ֻ�����γ�Ա����
	private String name;
	private int age;
	
	// ���⿪�ŷ�������������˽�еĳ�Ա����
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
	
	public void speak() {
		String name = "�ֲ�����";
		int age = 20;
		// thisָ����ǳ�Ա����
		System.out.println(this.name + "-----" + this.age);
	}
}
