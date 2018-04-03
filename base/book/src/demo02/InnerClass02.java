package demo02;

public class InnerClass02 {
	public static void main(String[] args) {
		Outer_01 o = new Outer_01();
		o.print();
	}
}

class Outer_01 {
	private int num = 10;
	private class Inner {
		public void method() {
			System.out.println(num + 2);
		}
	}
	
	public void print() {
		Inner i = new Inner();
		i.method();
	}
}
