package cn.itstar.demo01;
/*
 * 在类的定义上，加上修饰符 final
 * 类：最终类，不能有子类，不能被继承
 * 这个类属于太监类，没有孩子了
 * 比如：String f3进入源码
 * 但是使用方式没有变化，创建对象，调用方法
 * 可以正常使用
 */
public final class Fu {
	public void show(){
		System.out.println("最终类的方法");
	}
}
