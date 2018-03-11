package test.demo3;

/**
 * 研发部 属于 员工的一种
 * 	继承自员工
 * 关键字 extends
 * */

public class Develop extends Emplpyee{
	// 子类定义方法
	public void print() {
		// 打印父类的成员变量
		System.out.println(name);
	}
}
