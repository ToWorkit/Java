package demo03;

public class String_05 {
	public static void main(String[] args) {
		// �Ǿ�̬��������
		String_05 s = new String_05();
		s.fun_01();
		
		fun();
	}
	
	/**
	 * byte[] getBytes()
	 * ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte ������
	 * ���ַ���ת��Ϊ�ַ����� 
	 */
	// ��̬��֮�����ڻ�����������ʹ��.����
	public static void fun() {
		String s = "test";
		byte[] bytes = s.getBytes();
		for(int i: bytes) {
			System.err.println(i);
		}
	}
	
	/**
	 * int indexOf(int ch)
	 * ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
	 */
	// �Ǿ�̬������Ҫʵ����֮��ſ��Ե���
	public void fun_01() {
		String s = "test";
		int index = s.indexOf("s");
		System.out.println(index);
	}
	
}
