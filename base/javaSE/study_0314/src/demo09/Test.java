package demo09;

public class Test {
	public static void main(String[] args) {
		// 匿名内部类
		Animal a = new Animal() {
			// 需要重新抽象类的方法
			public void eat() {
				System.out.println("吃");
			}
			
			public void sleep() {
				System.out.println("睡觉");
			}
		};
		
		a.eat();
		a.sleep();
	}
}
