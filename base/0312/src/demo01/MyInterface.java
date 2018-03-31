package demo01;
// interface， 接口类 -> 方法全员抽象
public interface MyInterface {
	// 成员变量必须是常量 final, 一次赋值不可变
	public static final int a = 2;
	// 抽象方法
	public abstract void foo();
}
