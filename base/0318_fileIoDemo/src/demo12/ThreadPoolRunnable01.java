package demo12;

public class ThreadPoolRunnable01 implements Runnable{
	// �ӿ�ʵ���������д����
	@Override
	public void run() {
		System.out.println(new Thread().getName() + "->->->->");
	}
	
}
