package demo03;
/*
 * this�����ڹ��췽��֮����е���
 * this.�ķ�ʽ,���ֳ�Ա������ֲ�����֮����������
 * this�ڹ��췽��֮��ĵ��ã��﷨this()
 */
public class Person {
	String name;
	int age;
	int id;
	
	public Person() {
//		this("����",20, 2); -> ��ʽ���� -> set ����
		name = "����";
		age = 20;
		id = 2;
		//�������ģ�20 ���ݸ��˱���name age
		//this("����",20);this�����ã�ֱ�Ӹ�ֵ
		//ע�⣺this���ù��췽����ʱ��Ҫ�ڵ�һ��
		
	}

	//���췽����Ŀ�ľ�����new��ʱ�����ֱ��Ϊ��ĳ�Ա������ֵ
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println('-'); // ����this��ʵ��֤���޲�������ʱ���ᱻ����
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
