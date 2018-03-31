package demo05;

//继承抽象类，需要重写抽象方法
public class Dog extends Animal{

	@Override // 保护需要重写的方法名不被修改
	public void eat() {
		System.out.println("狗啃骨头");
	}

	// 自身独有的方法
	public void lookHome() {
		System.out.println("狗能看家");
	}
}
