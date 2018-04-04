package demo03;

public class Array_02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 66));
		System.out.println(getIndex(arr, 88));
	}
	
	/*
	 * 二分查找
	 * 	无序数组不可以使用二分查找，因为一旦排序就已经将原始的索引(key)改变了
	 */
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length -  1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {
			// 中间值比较，不相等则循环查找
			if (arr[mid] < value) {
				// 中间值小了改变最小索引
				min = mid + 1;
			} else if (arr[mid] > value) {
				// 大了改变最大索引
				max = mid - 1;
			}
			
			mid = (min + max) / 2;
			if (min > max) {
				// 最小大于最大时就没有可比性了(没有找到)
				return -1;
			}
		}
		return mid;
	}
}
