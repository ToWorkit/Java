public class ArrayDemo4{
	public static void main(String[] args){
		int[] arr = {1,3,4,5,7};
		//访问的第6个元素
		System.out.println(arr[4]);
		
		int[] arr2 = {1,3,6};
		System.out.println(arr2[2]);
		
		arr2 = null;
		System.out.println(arr2[2]);
	}
}