package demo01;

public class Test {
	public static void main(String[] args) {
		// �����ӿڵ�ʵ�������
		InterfaceImplements impl = new InterfaceImplements();
		// ����ʵ�����еķ���
		impl.foo();
		// ���˾�̬������(static)����ֱ�ӱ�����.����
		System.out.println(MyInterface.a);
	}
}
