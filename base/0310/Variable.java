public class Variable {
	/*
		�������, ���ʼ�
	*/
	public static void main(String[] args) {
		// ������������ -> �������Եľ��Ȼᱨ����ʧ�ı�����󣬾����ڱʼ��� 129
		byte b = 127;
		System.out.println(b);
		// ������
		short s = 32767;
		System.out.println(s);
		// Ĭ�ϵ�������
		int i = 20001002;
		System.out.println(i);
		// Long���� -> ������Ҫ�� L
		long l = 2147483649L;
		System.out.println(l);
		
		// ������ -> Ĭ����double�����Ժ���Ҫ�� F
		float f = 1.0F;
		System.out.println(f);
		// �����ͣ�˫����, ����� F����ʾҪתΪfloat���� 2.2F
		double d = 2.2;
		System.out.println(d);
		
		// �ַ���ֻ����һ��
		char c = '��';
		System.out.println(c);
		// �ַ���������Ϊ���, ����java������ 
		String s_ = "����";
		System.out.println(s_);
		
		// ��������
		boolean bl = true;
		System.out.println(bl);
		
		System.out.println(true & false);
	}
}