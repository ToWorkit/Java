package demo04;

public class Student extends Person{
	// 构造方法
	public Student() {
		// 隐式代码
		super(); // -> 无参构造方法
		// 子类中的super调用父类的构造方法
//		super("张三", 18); -> 有参构造方法
	}
}
