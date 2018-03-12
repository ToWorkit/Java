package com.itstar.demo01;
/*
 * 定义研发部
 * 		属于员工中的一种
 * 		研发员工继承研发类
 * 
 * 关键字：extends
 * 		子类Develop 父类Emplpyee
 * 子类自动拥有父类中可以继承的属性和方法
 * 
 * 
 */
public class Develop extends Emplpyee{
	//子类中定义了方法
	public void print() {
		//打印的是父类的成员变量
		System.out.println(name);
	}
}
