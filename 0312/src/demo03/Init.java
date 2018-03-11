package demo03;

public class Init {
	public static void main(String[] args) {
		// 多态
		// 父类的类型 变量 = new 子类的对象();
		Fu f = new Zi();
		f.show();
		
		Animal a = new Cat();
		a.eat();
		
		// 接口中的多态
		Smoking s = new Student();
		s.smoking();
	}
}
