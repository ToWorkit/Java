package demo02;

/*
 * �����鰴ָ�����ַ��ָ��Ϊ�ַ���
 */

public class array_fun02 {
	public static void main(String[] args) {
		int[] arr = {3, 4, 2};
		System.out.println(arrayToString(arr));
	}
	
	private static  String arrayToString(int[] arr) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();
		// �� [ ��ӵ�������
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
