package demo10;

public class SubThread01 extends Thread{
	// ʹ�ù��캯�����߳���
	public SubThread01() {
		super("��һ���߳�");
	}
	
	// ͨ�� Thread ���е�getName������ȡ�̵߳�����
	@Override
	public void run() {
		System.out.println(super.getName());
	}
}
