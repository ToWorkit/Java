package com.itstar.demo08;
/*
 * Ա���ࣺ
 * 	���Ե���ȡ
 *  ��������š���������������
 */
public abstract class Employee {
	String name;
	String id;
	
	//��new�����ʱ����Ծ�ֱ�Ӵ��������͹���
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
