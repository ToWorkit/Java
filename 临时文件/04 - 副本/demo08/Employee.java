package com.itstar.demo08;
/*
 * 员工类：
 * 	共性的提取
 *  姓名、编号、工作方法（抽象）
 */
public abstract class Employee {
	String name;
	String id;
	
	//当new对象的时候可以就直接带上姓名和工号
	public Employee(String name,String id) {
		this.name = name;
		this.id = id;
	}
	
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
