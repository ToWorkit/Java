package demo10;

/*
 * ÿ���̶߳�������
 */

public class ThreadDemo01 {
	public static void main(String[] args) {
		SubThread01 st = new SubThread01();
		st.start();
		
		// �Զ����߳���
		st.setName("�Զ����߳���");
		
		SubThread01 st1 = new SubThread01();
		st1.start();
		
		SubThread01 st2 = new SubThread01();
		st2.start();
		
		// ��ȡ�߳����Ƶ�ͨ�÷�ʽ
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "==");
	}
}
