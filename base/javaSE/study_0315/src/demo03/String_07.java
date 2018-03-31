package demo03;

public class String_07 {
	public static void main(String[] args) {
		count("112YTINzc");
	}
	
	/**
	 * 对大小写以及数字计数
	 */
	public static void count(String str) {
		int upStr = 0;
		int lowStr = 0;
		int num = 0;
		for(int i: str.toCharArray()) {
			if (i >= 65 && i <= 90) {
				upStr++;
			} else if (i >= 97 && i <= 122) {
				lowStr++;
			} else if (i >= 48 && i <= 57) {
				num++;
			}
		}
		System.out.println("大写" + upStr);
		System.out.println("小写" + lowStr);
		System.out.println("数字" + num);
	}
}
