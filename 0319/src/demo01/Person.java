package demo01;

public class Person {
	// ���η� Ĭ��Ϊdefault
	public String name;
	public int age;
	// ���Ա������ 06
	private int id;
	protected int test_01;
	
	// ���ձ������������������޸�
	final int id_01 = 1;
	
	// ����ķ���
	public void eat() {
		System.out.println("�ܵóԷ���");
	}
	public void sleep(String str, int i) {
		System.out.println(str + "---" + i);
	}
	
	// �޲ι��췽��
	public Person() {
		super();
	}
	// �в�
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// �����ⲿ���ʵ�Ȩ��
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
	
	// ��д��toString����
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
