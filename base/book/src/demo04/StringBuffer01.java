package demo04;

/**
 * * A:StringBuffer�Ĺ��췽����
		* public StringBuffer():�޲ι��췽��
		* public StringBuffer(int capacity):ָ���������ַ�������������
		* public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
	* B:StringBuffer�ķ�����
		* public int capacity()�����ص�ǰ������	����ֵ
		* public int length():���س��ȣ��ַ������� ʵ��ֵ
*/

public class StringBuffer01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// �����е��ַ�������ʵ��ֵ
		System.out.println(sb.length());
		// �����ĳ�ʼ����������ֵ
		System.out.println(sb.capacity());
		
		System.out.println("-------------------");
		
		StringBuffer sb1 = new StringBuffer(10);
		// �����е��ַ�������ʵ��ֵ
		System.out.println(sb1.length());
		// �����ĳ�ʼ����������ֵ
		System.out.println(sb1.capacity());
		
		System.out.println("-------------------");
		
		StringBuffer sb2 = new StringBuffer("Hello");
		// �����е��ַ�������ʵ��ֵ
		System.out.println(sb2.length());
		// �����ĳ�ʼ����������ֵ
		System.out.println(sb2.capacity());
	}
}
