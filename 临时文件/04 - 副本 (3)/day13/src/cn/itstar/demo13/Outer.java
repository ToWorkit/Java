package cn.itstar.demo13;
/*
 * 将一个类定义在方法中
 */
public class Outer {
	public void out(){
		class inner{
			public void inner() {
				System.out.println("局部内部类的方法");
			}
		}
		/*加上这个才能调用 方法依靠，来帮助调用
		 * inner in = new inner();
		in.inner();*/
	}
	
	public void out2() {
		//类不重名 属于不同的方法
		class inner{
			
		}
	}
}
