package demo04;


/**
 * * A:StringBuffer����ӹ���
	* public StringBuffer append(String str):
		* ���԰���������������ӵ��ַ�������������,�������ַ�������������
	* public StringBuffer insert(int offset,String str):
		* ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
	StringBuffer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���һ������Ϊ16���ַ�����
	��������ӵķ���ʱ,���������´�������,�ڲ�����ԭ����������ַ�
 */


/*
 * ������������
 */

public class StringBuffer02 {
	public static void main(String[] args) {
		demo();
		System.out.println("------------------");
		// �������
		StringBuffer sb = new StringBuffer("2345");
		System.out.println(sb);
		// ����֮ǰ
		sb.insert(1, "World");
		System.out.println(sb);
		// ɾ�� ��ͷ����β
		sb.delete(3, 5);
		System.out.println(sb);
		// �滻
		sb.replace(0, 1, "9");
		System.out.println(sb);
		// ��ת
		sb.reverse();
		System.out.println(sb);
		// ��ȡ, ��Ӱ��ԭʼ����
		String str_1 = sb.substring(1, 2);
		System.out.println(str_1);
		
		// תString
		String str_2 = new String(str_1);
		System.out.println(str_2);
		
		System.out.println(sb.toString());
	}
	
	private static void demo() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("Hello");
		StringBuffer sb4 = sb.append(20);
		
		// ������д��toString��������ʾ���Ƕ����е�����
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}
}
