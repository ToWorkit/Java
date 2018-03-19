package demo04;

public class Student extends Person{
	int a = 5;
	// 子类构造方法，会直接或间接的调用父类的构造方法
	public Student() {
		// 隐式代码 super()
//		super();
		// 可以有参数
		super("子类的构造方法", 11);
	}
}
