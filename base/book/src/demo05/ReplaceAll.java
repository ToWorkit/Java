package demo05;

public class ReplaceAll {
	public static void main(String[] args) {
		// 正则替换
		String s = "Hello 123 World 344556";
		String regex = "\\d";
		
		// 正则，要替换的
		String s1 = s.replaceAll(regex, "");
		System.out.println(s1);
		
		demo01();
		demo02();
	}
	
	public static void demo01() {
		String s = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String s1 = s.replaceAll("\\.+", "");
		System.out.println(s1);
		// 分组 (.) 1+ 代表重复  $1 代表第一组的内容
		String s2 = s1.replaceAll("([\u4e00-\u9fa5])\\1+", "$1");
		System.out.println(s2);
	}
	
	public static void demo02() {
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";
		// 以重复的字符串为切割标准
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
