package demo10;

public class SleepThread01 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 抛不出去是干啥
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
