package cn.itstar.demo15;
/*
 * new Animal() {
			public void eat() {
				System.out.println("猪在吃饭");
			}
			public void sleep() {
				System.out.println("猪在睡觉");
			}
			
		}.eat();
	}以上代码就是Animal的子类的对象
	多态性，父类引用 = 子类对象
 */
public class Test {
	public static void main(String[] args) {
		//匿名内部类 创建了对象，不调用方法是执行不了的。匿名类只能调用一个方法。
		new Animal() {
			public void eat() {
				System.out.println("猪在吃饭");
			}
			public void sleep() {
				System.out.println("猪在睡觉");
			}
			
		}.eat();
	}
	
	//父类引用指向子类对象
	public static void main1(String[] args) {
		//匿名内部类 创建了对象，不调用方法是执行不了的。匿名类只能调用一个方法。
		Animal a = new Animal() {
			public void eat() {
				System.out.println("猪在吃饭");
			}
			public void sleep() {
				System.out.println("猪在睡觉");
			}
			
		};
		a.eat();
		a.sleep();
	}
}
