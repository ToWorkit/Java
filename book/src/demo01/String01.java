package demo01;

import java.util.Scanner;

public class String01 {
	private static String s = "123";
	public static void main(String[] args) {
		String message = "Hello World";
		System.out.println(message.length()); // 11
		System.out.println(message.charAt(0)); // H
		
		// ����̨��ȡ�ı�
/*		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println("����" + s);*/
		
		// �Ƚ��ַ����ķ���
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.substring(0, 2));
		
		// �ַ�������תint������
		int intVal = Integer.parseInt(s);
		System.out.println(intVal + 1);
		
		// �Ƿ�����ָ���ַ���ͷ
		System.out.println(s1.startsWith("H"));
		// �Ƿ�����ָ���ַ���β
		System.out.println(s1.endsWith("l"));
		// ָ���ַ��Ƿ��Ǹ��ַ������Ӵ�
		System.out.println(s1.contains("o"));
	}
}
