package demo05;

/*
 * 研发
 * */

public abstract class Develop extends Employee {
	// 构造方法 会直接或者间接的 去调用父类的构造方法
	public Develop(String name, String id) {
		super(name, id);
	}
}
