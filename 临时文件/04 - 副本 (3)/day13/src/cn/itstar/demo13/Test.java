package cn.itstar.demo13;

public class Test {
	public static void main(String[] args) {
		//可以调用这个方法，但是什么都没有，原因调用不到局部内部类的方法
		new Outer().out();
	}
}
