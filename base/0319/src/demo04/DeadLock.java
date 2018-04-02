package demo04;

public class DeadLock implements Runnable{
	private int i = 0;
	@Override
	public void run() {
		while(true) {
			if (i % 2 == 0) {
				// �Ƚ���Aͬ�����ٽ���Bͬ��
				synchronized(LockA.locka) {
					System.out.println("if�е�LockA");
					synchronized(LockB.lockb) {
						System.out.println("if�е�LockB");
					}
				}
			} else {
				// �Ƚ���Bͬ�����ٽ���Aͬ��
				synchronized(LockB.lockb) {
					System.out.println("else�е�LockB");
					synchronized(LockA.locka) {
						System.out.println("elese�е�Locka");
					}
				}
			}
			i++;
		}
	}
}
