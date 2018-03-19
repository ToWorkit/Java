package demo05;

public abstract class Develop extends Employee{
	// Develop 构造方法 子类的构造方法会直接或者间接调用父类的构造方法
	public Develop(String name, String id) {
		// 隐式代码
		// 父类为有参构造方法
		super(name, id);
	}
	
}
