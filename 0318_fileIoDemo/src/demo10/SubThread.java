package demo10;

/*
 * �̳з�ʽ�����߳� 
 * ��ռ��Դ��˭����ִ��˭
 */

public class SubThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("SubThread -> " + i);
		}
	}
}
