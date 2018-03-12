public class ArrayArray3{
	public static void main(String[] args){
		//定义
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9},{0}};
		
		//外循环
		for(int i = 0;i < arr.length;i++){
			//内循环 遍历每一个一维数组
			for(int j = 0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
			
			System.out.println();
		}
	}
}