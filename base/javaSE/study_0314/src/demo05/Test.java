package demo05;

public class Test {
	public static void main(String[] args) {
		// ����ʵ����
		Person p = new Person();
		p.eat();
		
		// ����д��
		new Person().eat();
		// ���Զ��
		new Person().eat();
		
		// ����������Ϊ��������
		method(new Person());
	}

	public static void method(Person p) {
		p.eat();
	}
}
