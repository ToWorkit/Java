package demo05;

public class OutThread implements Runnable{
	private Resource r;

	@Override
	public void run() {
		while(true) {
			synchronized (r) {
				// 判断标记false等待
				if (!r.flag) {
					try {
						r.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(r.name + "..." + r.sex);
				
				// 标记为 false 唤醒对方线程
			}
		}
	}
	
}
