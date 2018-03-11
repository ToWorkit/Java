package test.demo3;

public class Test {
	public static void main(String[] args) {
		// 创建 Zi 对象(实例化)
		Zi z = new Zi();
		int i = z.a;
		// 子类有用自己的，没有再去找父类的
		System.out.println(i);
		
		z.show();
	}
}
