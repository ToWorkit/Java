package test.demo3;

/**
 * 执行函数
 * */

public class Init {
	public static void main(String[] args) {
		// 创建研发部对象(实例化)
		Develop d = new Develop();
		// 调用父类的方法
		d.name = "呦吼";
		d.work();
		// 调用自己的方法
		d.print();
		
		// 创建运维对象(实例化)
		YunWei y = new YunWei();
		// 调用父类的方法
		y.name = "哈哈";
		y.work();
		// 调用自己的方法
		y.print();
	}
}
