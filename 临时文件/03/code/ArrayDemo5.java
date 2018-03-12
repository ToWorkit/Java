public class ArrayDemo5{
	public static void main(String[] args){
		int[] arr = {1,2,3,5,6,7};
		int max = arr[0];
		
		for(int i = 0;i < arr.length;i++){
			//如果max小于某个元素 取此元素的值
			if(max < arr[i]){
				max = arr[i];	
			}
		}
		//遍历完成，打印输出
		System.out.println(max);
	}
}