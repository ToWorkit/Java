package comitstar.demo03;

public class SubThread extends Thread{
	//ʹ�ù����������߳�����
//	public SubThread() {
//		super("��������һ������");
//	}
	
	//ͨ��thread���е�getName������ȡ�߳�����
	public void run() {
		
		System.out.println(super.getName());
		//System.out.println(0/0);
	}
}
