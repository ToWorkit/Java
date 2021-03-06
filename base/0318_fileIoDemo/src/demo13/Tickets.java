package demo13;

/*
 * 售票
 * synchronized 同步
 * 公式：
 * 	synchronized(任意对象){
 * 		线程操作的共享数据
 *  }
 */

public class Tickets implements Runnable{
	// 定义出票的票源
	public int tikets = 10;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			payTickets();
		}
	}
	
	// 同步方法，存在对象锁 -> this
	public synchronized void payTickets() {
		if (tikets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName() + "出售第" + tikets--);
		}
	}
	
}
