package cn.itstar.demo03;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		//�������������� ����ķ���
		z.show();
		
		final int i = 2;//��final���Σ�һ�θ�ֵ�������䣬final���εĿ��Կ����ɳ���
		//i = 10;������ӡ���ԣ����ǲ��ܸ�ֵ
		//int j = i + 1;���ǿ��Ե� ����û�и�i��ֵ
		System.out.println(i);
		
		//final�������ñ�������
		//�����������ڴ��ַ�������� ������������ ���ڴ��еĵ�ַ
		final Zi z2 = new Zi();
		//z2 = new Zi();�����ԣ�new��֮���ַ�ͱ���
	}
}
