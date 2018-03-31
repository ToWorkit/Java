package demo05;

/*
 * 输入线程
 * 	对资源进行赋值  变量
 */

public class InputThread implements Runnable{
	private Resource r;
	public InputThread(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			synchronized(r) {
				if(r.flag) {
					try {
						r.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(i % 2 == 0) {
					r.name = "a";
					r.sex = "girl";
				} else {
					r.name = "b";
					r.sex = "man";
				}
				// 将对方线程唤醒，标记为true
				r.flag = true;
			}
			i++;
		}
	}

}
