package demo03;

public class String02 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1);
		System.out.println(s2);
		
		// �����������ͣ��Ƚϵ����ڴ��ַ
		System.out.println(s1 == s2);
		// String ������д�� equals ����
		// �𿪶�ÿ��ֵ���а����Ƚ�
		System.out.println(s1.equals(s2));
	}
}
