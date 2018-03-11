package demo03;

// 实现接口
public class Student implements Smoking{
	// 需要重写接口方法
	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		System.out.println("学生在抽烟");
	}
}
