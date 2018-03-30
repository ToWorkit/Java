package demo01;

import java.util.Scanner;

/*
 * 十六进制转十进制
 */

public class String02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 接收输入值
		String instr = input.nextLine();
		
		if (instr.length() != 1) {
			System.exit(1);
		}
		
		char ch = Character.toUpperCase(instr.charAt(0));
		if (ch <= 'F' && ch >= 'A') {
			int _value = ch - 'A' + 10;
			System.out.println("字符" + ch + "转为十进制为" + _value);
		// 数字，检测ch方法是否在 '0' - '9' 之间
		} else if (Character.isDigit(ch)) {
			System.out.println("数字" + ch + "转为" + ch);
		} else {
			System.out.println("输入无效");
		}
	}
}
