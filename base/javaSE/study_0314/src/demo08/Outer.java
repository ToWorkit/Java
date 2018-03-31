package demo08;

public class Outer {
	public void out() {
		// 将一个类定义在方法中
		class inner{
			public void inner() {
				 System.out.println("out局部内部类的方法");
			}
		}
		// 外部实现调用需要在方法内部进行实例化
		inner i = new inner();
		i.inner();
	}
	public void out2() {
		// 类重名，但属于不同的方法
		class inner {
			public void inner() {
				System.out.println("out2局部内部类方法");
			}
		}
		// 外部实现调用需要在方法内部进行实例化
		inner i = new inner();
		i.inner();
	}
}
