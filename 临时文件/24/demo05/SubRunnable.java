package comitstar.demo05;

public class SubRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+"run...."+i);
		}
	}
	
}
