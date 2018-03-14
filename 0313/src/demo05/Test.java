package demo05;

public class Test {
	public static void main(String[] args) {
		JavaEE jv = new JavaEE("嗯嗯", "20");
		jv.work();
		
		// 数组
		int[] arr = {1, 2, 3};
		// 越界异常
		System.out.println(arr[2]);
		
		arr = null;
		// 空指针异常
		System.out.println(arr[1]);
		
		// 二维数组
		int[][] arr_2 = {{2, 3, 4}, {1, 2}, {0, 3, 9}};
		System.out.println(arr_2[1][0]);
	}
}
