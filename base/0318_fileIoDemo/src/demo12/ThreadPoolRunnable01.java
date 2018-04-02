package demo12;

public class ThreadPoolRunnable01 implements Runnable{
	// 接口实现类必须重写方法
	@Override
	public void run() {
		System.out.println(new Thread().getName() + "->->->->");
	}
	
}
