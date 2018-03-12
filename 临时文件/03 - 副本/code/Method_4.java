public class Method_4{
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		System.out.println(arr[2]);//3
		
		change(arr);
		System.out.println(arr[2]);//10
	}
	
	public static void change(int[] arr){
		arr[2] = 10;
	}
}