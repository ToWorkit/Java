package demo02;

public class InnerClass04 {
	public static void main(String[] args) {
		Outer_04 o = new Outer_04();
		o.method();
	}
}

// �ֲ��ڲ���
class Outer_04 {
	public void method() {
		final int num = 10;
		class Inner {
			public void print() {
				System.out.println(num);
			}
		}
		Inner i = new Inner();
		i.print();
	}
	
	// �ֲ��ڲ���ֻ���������ڵķ����з���
/*	public void run() {
		Inner i = new Inner();
	}*/
}
