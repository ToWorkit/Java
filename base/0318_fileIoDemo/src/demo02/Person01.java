package demo02;

public class Person01 {
	private String name;
	private int age;
	public int id;
	
	// ���췽��
	public Person01() {
		super();
	}
	public Person01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// get��set����
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
	
	// ��дtoString����
	public String toString() {
		return name + "---" + age;
	}
	// ��дhashCode����
	public int hashCode() {
		// age ^ 10 Խ�󣬽�����ظ������Խ��Խ����
		return name.hashCode() + age ^ 10;
	}
	// ��дequals��������true����һ����ֵ
	public boolean equals(Object obj) {
		// �����ߺͱ��Ƚ���
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// ����Person01�ٽ���ǿת�Ƚ�
		if (obj instanceof Person01) {
			/*
			 *  ǿת��ԭ���� HashDemo01 ��ʹ�ù��췽�����ε� Person01 ��
			 *  Ҫ�Ƚ����� new ʵ������Ķ��󣬵�ַ�϶��ǲ�һ���ģ�����ֻ�ܱȽ�ʵ�����󴫵� Person01 �е�ֵ���Ƿ�һ��
			 *  һ�����ж�Ϊ�ظ�
			 */
			Person01 p = (Person01)obj;
			// println ���Զ����� toString ����
			System.out.println(obj);
			System.out.println(name);
			System.out.println(p.name);
			System.out.println(age);
			System.out.println(p.age);
			System.out.println(name.equals(p.name));
			return name.equals(p.name) && age == p.age;
		}
		// ��������ֱ�ӷ���false
		return false;
	}
}
