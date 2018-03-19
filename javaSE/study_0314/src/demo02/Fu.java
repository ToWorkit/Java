package demo02;

public class Fu {
	// 最终方法，不可被修改
	public final void show() {
		System.out.println("父类的最终方法，不可修改");
	}
	public void fun() {
		System.out.println("普通方法");
	}
}
