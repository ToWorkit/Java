package demo02;

/*
 * 冒泡排序
 */

public class array_fun01 {
	public static void main(String[] args) {
		int[] arr = {12, 11, 10, 90, 13, 9};
//		bubbleSort(arr);
		selectSort(arr);
		print(arr);
	}
	
	/*
	 * 冒泡排序
	 * 	返回值 void
	 * 	参数列表 int[] arr
	 */
	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// -1 防止索引越界，-i 提供效率
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
/*					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;*/
					swap(arr, j, j + 1);
				}
			}
		}
	}
	
	/*
	 * 选择排序
	 * 	返回值 void
	 * 	参数列表 int[] var
	 */
	public static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	
	
	/*
	 * 打印数组
	 * 	返回值 void
	 * 	参数列表 int[] arr
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	
	// 数据交换
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
