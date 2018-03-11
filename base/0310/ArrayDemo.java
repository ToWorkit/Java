public class ArrayDemo {
	public static void main(String[] args) {
		// 定义数组
		// 数据类型，变量名，new，数据类型
		// 在同一个数组里，存放的元素类型必须一致
		int[] arr = new int[]{1, 2, 3, 4};
		System.out.println(arr[2]);
		System.out.println(arr.length);
		
		// 二
		int[] arr_2 = {5, 6, 7, 8};
		System.out.println(arr_2[0]);
		System.out.println(arr_2.length);
		
		// 遍历
		for(int i = 0; i < arr_2.length; i++) {
			System.out.println(arr_2[i]);
		}
		
		System.out.println("---");
		
		// 二维数组
		int[][] arr_3 = new int[][]{{1, 2, 3}, {2, 3, 1}, {4, 5, 6}, {7, 6, 5}};
		System.out.println(arr_3[0][1]);
	}
}