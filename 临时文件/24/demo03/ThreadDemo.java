package comitstar.demo03;
/*
 * ÿ���̶߳����Լ�������
 * 
 */
public class ThreadDemo {
	public static void main(String[] args) {
		
		//System.out.println(0/0);
		
		SubThread st = new SubThread();
		st.start();
		
		//�����Զ����߳�����
		//st.setName("�����Զ����߳�");
		
		SubThread st1 = new SubThread();
		st1.start();
		
		SubThread st2 = new SubThread();
		st2.start();
		
		
		//��ȡ�߳����Ƶ�ͨ�÷�ʽ
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
	}
}
