package demo05;

// 继承抽象类，需要重写抽象方法
public class Cat extends Animal{
	int a = 1;

	@Override // 保护需要重写的方法名不被修改
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	// 自身独有的方法
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}

}
