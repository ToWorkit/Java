package cn.itstar.demo03;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		//都可以正常调用 父类的方法
		z.show();
		
		final int i = 2;//被final修饰，一次赋值，终身不变，final修饰的可以看做成常量
		//i = 10;正常打印可以，但是不能改值
		//int j = i + 1;这是可以的 ，并没有该i的值
		System.out.println(i);
		
		//final修饰引用变量问题
		//变量，保存内存地址，终身不变 引用数据类型 是内存中的地址
		final Zi z2 = new Zi();
		//z2 = new Zi();不可以，new了之后地址就变了
	}
}
