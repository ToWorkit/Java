package demo10;

/*
 * 继承方式创建线程 
 * 抢占资源，谁抢到执行谁
 */

public class SubThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("SubThread -> " + i);
		}
	}
}
