package demo08;

import java.util.HashSet;
import java.util.Scanner;

/**
 * ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
 * aaaabbbcccddd
 * 
 * ����:
 * 1,����Scanner����
 * 2,����HashSet����,���ַ��洢,ȥ���ظ�
 * 3,���ַ���ת��Ϊ�ַ�����,��ȡÿһ���ַ��洢��HashSet������,�Զ�ȥ���ظ�
 * 4,����HashSet,��ӡÿһ���ַ�
 */

public class HashSet02 {
	public static void main(String[] args) {
		// ����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		String line = sc.nextLine();
		// ����HashSet���󣬽��ַ����洢��ȥ���ظ�
		// Character -> �ַ�����(�ַ���װ��)
		HashSet<Character> hs = new HashSet<>();
		// ���ַ���ת��Ϊ�ַ����飬��ȡÿһ���ַ��洢��HashSet�����У��Զ�ȥ���ظ�
		char[] arr = line.toCharArray();
//		System.err.println(arr[0]);
		// �����ַ�����
		for(char c: arr) {
			hs.add(c);
		}
		// ���Զ�ȥ�أ�����HashSet����
		for(Character ch: hs) {
			System.out.print(ch + " ");
		}
	}
}
