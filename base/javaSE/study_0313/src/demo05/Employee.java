package demo05;

/**
 * �����࣬��ȡ�����ķ���
 * */

public abstract class Employee {
	static String name;
	static String id;
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// ���󷽷��������г�����
	public abstract void work();
}
