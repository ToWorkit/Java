package demo05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern01 {
	public static void main(String[] args) {
		// ������ʽ
		Pattern p = Pattern.compile("a*b");
		// ƥ����
		Matcher m = p.matcher("aaaab");
		// �Ƿ�ƥ��, ���ز���ֵ
		boolean b = m.matches();
		System.out.println(b);
		
		
		System.out.println("aaaab".matches("a*b"));
	}
}
