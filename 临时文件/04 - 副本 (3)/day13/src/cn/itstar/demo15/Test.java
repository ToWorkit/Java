package cn.itstar.demo15;
/*
 * new Animal() {
			public void eat() {
				System.out.println("���ڳԷ�");
			}
			public void sleep() {
				System.out.println("����˯��");
			}
			
		}.eat();
	}���ϴ������Animal������Ķ���
	��̬�ԣ��������� = �������
 */
public class Test {
	public static void main(String[] args) {
		//�����ڲ��� �����˶��󣬲����÷�����ִ�в��˵ġ�������ֻ�ܵ���һ��������
		new Animal() {
			public void eat() {
				System.out.println("���ڳԷ�");
			}
			public void sleep() {
				System.out.println("����˯��");
			}
			
		}.eat();
	}
	
	//��������ָ���������
	public static void main1(String[] args) {
		//�����ڲ��� �����˶��󣬲����÷�����ִ�в��˵ġ�������ֻ�ܵ���һ��������
		Animal a = new Animal() {
			public void eat() {
				System.out.println("���ڳԷ�");
			}
			public void sleep() {
				System.out.println("����˯��");
			}
			
		};
		a.eat();
		a.sleep();
	}
}
