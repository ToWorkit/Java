public class ArrayDemo5{
	public static void main(String[] args){
		int[] arr = {1,2,3,5,6,7};
		int max = arr[0];
		
		for(int i = 0;i < arr.length;i++){
			//���maxС��ĳ��Ԫ�� ȡ��Ԫ�ص�ֵ
			if(max < arr[i]){
				max = arr[i];	
			}
		}
		//������ɣ���ӡ���
		System.out.println(max);
	}
}