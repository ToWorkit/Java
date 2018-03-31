package demo05;

/**
 * 员工 
 * 	共性 -> 姓名, 编号，工作方式 
 * */

// 抽象类
public abstract class Employee {
	String name;
	String id;
	
	// 有参数构造方法，实例化的时候可以直接赋值
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// 抽象方法
	public abstract void work();
	
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
