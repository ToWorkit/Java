package comitstar.demo02;
/*
 * �����߳� �̳з�ʽ
 */
public class SubThread extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println("run..."+i);
		}
	}
}
