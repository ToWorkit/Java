package demo05;

//�̳г����࣬��Ҫ��д���󷽷�
public class Dog extends Animal{

	@Override // ������Ҫ��д�ķ����������޸�
	public void eat() {
		System.out.println("���й�ͷ");
	}

	// ������еķ���
	public void lookHome() {
		System.out.println("���ܿ���");
	}
}
