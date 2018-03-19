package demo04;

public class RegExpDemo02 {
	public static void main(String[] args) {
		replace_a();
	}
	
	public static void replace_a() {
		String str = "abcv12313213data123124124";
		// 需要转义
		str = str.replaceAll("[\\d]", "*");
		System.out.println(str);
	}
}
