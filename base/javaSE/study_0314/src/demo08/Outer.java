package demo08;

public class Outer {
	public void out() {
		// ��һ���ඨ���ڷ�����
		class inner{
			public void inner() {
				 System.out.println("out�ֲ��ڲ���ķ���");
			}
		}
		// �ⲿʵ�ֵ�����Ҫ�ڷ����ڲ�����ʵ����
		inner i = new inner();
		i.inner();
	}
	public void out2() {
		// �������������ڲ�ͬ�ķ���
		class inner {
			public void inner() {
				System.out.println("out2�ֲ��ڲ��෽��");
			}
		}
		// �ⲿʵ�ֵ�����Ҫ�ڷ����ڲ�����ʵ����
		inner i = new inner();
		i.inner();
	}
}
