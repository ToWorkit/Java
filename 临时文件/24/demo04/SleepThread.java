package comitstar.demo04;

public class SleepThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			//�ײ���ȥ 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}
