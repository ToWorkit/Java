package demo05;

public class Java extends Develop{
	
	// ���췽��
	public Java(String name, String id) {
		super(name, id);
	}
	
	// ������̳У����������д�����෽��
	public void work() {
		System.out.println(super.name + "--" + super.id);
	}
}
