package demo05;

public class ReplaceAll {
	public static void main(String[] args) {
		// �����滻
		String s = "Hello 123 World 344556";
		String regex = "\\d";
		
		// ����Ҫ�滻��
		String s1 = s.replaceAll(regex, "");
		System.out.println(s1);
		
		demo01();
		demo02();
	}
	
	public static void demo01() {
		String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s1 = s.replaceAll("\\.+", "");
		System.out.println(s1);
		// ���� (.) 1+ �����ظ�  $1 �����һ�������
		String s2 = s1.replaceAll("([\u4e00-\u9fa5])\\1+", "$1");
		System.out.println(s2);
	}
	
	public static void demo02() {
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";
		// ���ظ����ַ���Ϊ�и��׼
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
