package demo05;

// �̳г����࣬��Ҫ��д���󷽷�
public class Cat extends Animal{
	int a = 1;

	@Override // ������Ҫ��д�ķ����������޸�
	public void eat() {
		System.out.println("è����");
	}
	
	// ������еķ���
	public void catchMouse() {
		System.out.println("èץ����");
	}

}
