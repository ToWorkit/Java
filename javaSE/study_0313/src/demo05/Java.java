package demo05;

public class Java extends Develop{
	
	// 构造方法
	public Java(String name, String id) {
		super(name, id);
	}
	
	// 抽象类继承，子类必须重写服父类方法
	public void work() {
		System.out.println(super.name + "--" + super.id);
	}
}
