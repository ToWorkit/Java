package demo05;

public class JavaEE extends Develop{

	public JavaEE(String name, String id) {
		super(name, id);
	}
	
	// ������д����ĳ��󷽷�
	public void work() {
		// ��ȡ��������
		System.out.println(super.name + "---" + super.id);
	}
}
