package demo04;

/*
 * 将数组的数据按照指定的格式拼接成字符串
 */

public class StringBuffer03 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 1};
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(int[] arr) {
		// 创建换成区
		StringBuffer sb = new StringBuffer();
		// 添加到缓冲区
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i] + "]");
			} else {
				sb.append(arr[i] + ",");
			}
		}
		return sb.toString();
	}
}
