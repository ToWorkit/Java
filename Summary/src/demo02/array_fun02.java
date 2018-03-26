package demo02;

/*
 * 将数组按指定的字符分割变为字符串
 */

public class array_fun02 {
	public static void main(String[] args) {
		int[] arr = {3, 4, 2};
		System.out.println(arrayToString(arr));
	}
	
	private static  String arrayToString(int[] arr) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		// 将 [ 添加到缓冲区
		sb.append("[");
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {
				sb.append(arr[i]).append(",");
			}
		}
		return sb.toString();
	}
}
