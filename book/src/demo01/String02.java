package demo01;

import java.util.Scanner;

/*
 * ʮ������תʮ����
 */

public class String02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ��������ֵ
		String instr = input.nextLine();
		
		if (instr.length() != 1) {
			System.exit(1);
		}
		
		char ch = Character.toUpperCase(instr.charAt(0));
		if (ch <= 'F' && ch >= 'A') {
			int _value = ch - 'A' + 10;
			System.out.println("�ַ�" + ch + "תΪʮ����Ϊ" + _value);
		// ���֣����ch�����Ƿ��� '0' - '9' ֮��
		} else if (Character.isDigit(ch)) {
			System.out.println("����" + ch + "תΪ" + ch);
		} else {
			System.out.println("������Ч");
		}
	}
}
