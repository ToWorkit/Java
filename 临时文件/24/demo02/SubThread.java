package comitstar.demo02;
/*
 * 创建线程 继承方式
 */
public class SubThread extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println("run..."+i);
		}
	}
}
