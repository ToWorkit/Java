package demo05;

/*
 * �����߳�
 * 	����Դ���и�ֵ  ����
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
				// ���Է��̻߳��ѣ����Ϊtrue
				r.flag = true;
			}
			i++;
		}
	}

}
