package demo03;

public class String08 {
	public static void main(String[] args) {
		int c = count("jasdsdjarerejadfdvja", "ja");
		System.out.println(c);
	}
	
	/**
	 * 找到一个字符串在另一个字符串中出现的次数
	 */
	public static int count(String str, String key) {
		int con = 0;
		int index = 0;
		while((index = str.indexOf(key)) != -1) {
			con++;
			str = str.substring(index + key.length());
		}
		return con;
	}
}
