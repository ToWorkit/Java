public class ArrayArray3{
	public static void main(String[] args){
		//����
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9},{0}};
		
		//��ѭ��
		for(int i = 0;i < arr.length;i++){
			//��ѭ�� ����ÿһ��һά����
			for(int j = 0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
			
			System.out.println();
		}
	}
}