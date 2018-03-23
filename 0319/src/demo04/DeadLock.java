package demo04;

public class DeadLock implements Runnable{
	private int i = 0;
	@Override
	public void run() {
		while(true) {
			if (i % 2 == 0) {
				// 先进入A同步，再进入B同步
				synchronized(LockA.locka) {
					System.out.println("if中的LockA");
					synchronized(LockB.lockb) {
						System.out.println("if中的LockB");
					}
				}
			} else {
				// 先进入B同步，再进入A同步
				synchronized(LockB.lockb) {
					System.out.println("else中的LockB");
					synchronized(LockA.locka) {
						System.out.println("elese中的Locka");
					}
				}
			}
			i++;
		}
	}
}
