package demo05;

public class Test {
	public static void main(String[] args) {
		JavaEE jv = new JavaEE("����", "20");
		jv.work();
		
		// ����
		int[] arr = {1, 2, 3};
		// Խ���쳣
		System.out.println(arr[2]);
		
		arr = null;
		// ��ָ���쳣
		System.out.println(arr[1]);
		
		// ��ά����
		int[][] arr_2 = {{2, 3, 4}, {1, 2}, {0, 3, 9}};
		System.out.println(arr_2[1][0]);
	}
}
