package demo02;

public class Init {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.fun();
		z.show();
		
		// final ���ε�ֵ���ɱ䣬����ַ�ɱ�
		final int i = 2;
//		i = 10;
		// ��δ�޸�ֵ
		int j = i + 1;
		System.out.println(i);
	}
}
