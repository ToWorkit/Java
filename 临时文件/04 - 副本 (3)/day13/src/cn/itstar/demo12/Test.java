package cn.itstar.demo12;

public class Test {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.inner();
	}
}
