package test.demo4;

/**
 * 员工，抽象类
 * */

// 抽象类父类
public abstract class Employee {
	// 私有成员变量
	private String name;
	private String id;
	
	// 抽象类方法, 继承类必须重构
	public abstract void Test();
	
	// 开放私有成员变量的访问方法
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
