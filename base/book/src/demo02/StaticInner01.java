package demo02;

public class StaticInner01 {
	public static void main(String[] args) {
		// �ⲿ����.�ڲ����� ������ = �ⲿ����.�ڲ������;
//		Outer_02.Inner oi = new Outer_02.Inner();
//		oi.method();
		
		// ��̬�����ֱ�ӷ���
		Outer_02.Inner2.print();
	}
}

class Outer_02 {
	static class Inner {
		public void method() {
			System.out.println("Inner_method");
		}
	}
	
	static class Inner2 {
		public static void print() {
			System.out.println("Inner2_print");
		}
	}
}