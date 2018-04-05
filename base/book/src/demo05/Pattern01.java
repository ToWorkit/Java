package demo05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern01 {
	public static void main(String[] args) {
		// 正则表达式
		Pattern p = Pattern.compile("a*b");
		// 匹配器
		Matcher m = p.matcher("aaaab");
		// 是否匹配, 返回布尔值
		boolean b = m.matches();
		System.out.println(b);
		
		
		System.out.println("aaaab".matches("a*b"));
	}
}
