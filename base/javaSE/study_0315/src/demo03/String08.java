package demo03;

public class String08 {
	public static void main(String[] args) {
		int c = count("jasdsdjarerejadfdvja", "ja");
		System.out.println(c);
	}
	
	/**
	 * �ҵ�һ���ַ�������һ���ַ����г��ֵĴ���
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
