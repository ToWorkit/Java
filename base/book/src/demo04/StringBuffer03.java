package demo04;

/*
 * ����������ݰ���ָ���ĸ�ʽƴ�ӳ��ַ���
 */

public class StringBuffer03 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 1};
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(int[] arr) {
		// ����������
		StringBuffer sb = new StringBuffer();
		// ��ӵ�������
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
