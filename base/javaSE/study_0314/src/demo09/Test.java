package demo09;

public class Test {
	public static void main(String[] args) {
		// �����ڲ���
		Animal a = new Animal() {
			// ��Ҫ���³�����ķ���
			public void eat() {
				System.out.println("��");
			}
			
			public void sleep() {
				System.out.println("˯��");
			}
		};
		
		a.eat();
		a.sleep();
	}
}
