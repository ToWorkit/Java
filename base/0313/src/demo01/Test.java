package demo01;

public class Test {
	public static void main(String[] args) {
		// 构造方法，实例化的时候可以直接赋值
		Person p = new Person("哈哈", 20);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
