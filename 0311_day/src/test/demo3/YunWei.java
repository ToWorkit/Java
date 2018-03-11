package test.demo3;

/**
 * 运维 属于 员工的一种
 * 	继承 自 员工
 * */

public class YunWei extends Emplpyee{
	// 定义子类方法
	public void print() {
		// 打印父类的成员变量
		System.out.println(name);
	}
}
