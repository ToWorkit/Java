public class ArrayDemo {
	public static void main(String[] args) {
		// ��������
		// �������ͣ���������new����������
		// ��ͬһ���������ŵ�Ԫ�����ͱ���һ��
		int[] arr = new int[]{1, 2, 3, 4};
		System.out.println(arr[2]);
		System.out.println(arr.length);
		
		// ��
		int[] arr_2 = {5, 6, 7, 8};
		System.out.println(arr_2[0]);
		System.out.println(arr_2.length);
		
		// ����
		for(int i = 0; i < arr_2.length; i++) {
			System.out.println(arr_2[i]);
		}
		
		System.out.println("---");
		
		// ��ά����
		int[][] arr_3 = new int[][]{{1, 2, 3}, {2, 3, 1}, {4, 5, 6}, {7, 6, 5}};
		System.out.println(arr_3[0][1]);
	}
}