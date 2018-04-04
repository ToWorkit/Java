package demo03;

public class Array_02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 66));
		System.out.println(getIndex(arr, 88));
	}
	
	/*
	 * ���ֲ���
	 * 	�������鲻����ʹ�ö��ֲ��ң���Ϊһ��������Ѿ���ԭʼ������(key)�ı���
	 */
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length -  1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {
			// �м�ֵ�Ƚϣ��������ѭ������
			if (arr[mid] < value) {
				// �м�ֵС�˸ı���С����
				min = mid + 1;
			} else if (arr[mid] > value) {
				// ���˸ı��������
				max = mid - 1;
			}
			
			mid = (min + max) / 2;
			if (min > max) {
				// ��С�������ʱ��û�пɱ�����(û���ҵ�)
				return -1;
			}
		}
		return mid;
	}
}
