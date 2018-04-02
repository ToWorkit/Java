package demo04;
/**
 * 正则
 */
public class RegexpDemo {
	public static void main(String[] args) {
		checkTelNumber();
		split_1();
	}
	
	// 正则匹配成功返回布尔值
	public static void checkTelNumber() {
		String tel = "23800000000";
		boolean b = tel.matches("1[34578][0-9]{9}");
		System.out.println(b);
	}
	
	// split 字符串切割
	public static void split_1() {
		// 多个空格切割
		String s = "22 23    34        12";
		String[] s_arr = s.split(" +");
		for(int i = 0; i < s_arr.length; i ++) {
			System.out.println(s_arr[i]);
		}
		System.out.println("----------------");
		
		// 小数点切分
		String str = "192.168.50.146";
		String[] arr = str.split("\\.");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
