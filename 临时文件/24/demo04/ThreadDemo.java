package comitstar.demo04;
/*
 * �߳����߷���sleep()
 */
public class ThreadDemo {
	public static void main(String[] args) throws Throwable {
//		for(int i=0;i < 10;i++) {
//			Thread.sleep(1000);
//			System.out.println(i);
//		}
		
		new SleepThread().start();
	}
}
