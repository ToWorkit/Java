package test.demo4;

/**
 * Ա����������
 * */

// �����ุ��
public abstract class Employee {
	// ˽�г�Ա����
	private String name;
	private String id;
	
	// �����෽��, �̳�������ع�
	public abstract void Test();
	
	// ����˽�г�Ա�����ķ��ʷ���
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
