package demo05;

public class JavaEE extends Develop{

	public JavaEE(String name, String id) {
		super(name, id);
	}
	
	// 必须重写父类的抽象方法
	public void work() {
		// 获取父类数据
		System.out.println(super.name + "---" + super.id);
	}
}
