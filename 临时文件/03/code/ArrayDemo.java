public class ArrayDemo{
	public static void main(String[] args){
		//����һ������
		//��ʽ����������[] ������ = new ��������[�洢Ԫ�صĸ���];
		int[] arr = new int[4];
		System.out.println(arr);
		
		//ͨ�������ķ�ʽ
		System.out.println(arr[1]);
		
		System.out.println(arr.length);
		
		//�����Ԫ�ظ�ֵ
		arr[1] = 3;
		System.out.println(arr[1]);
	}
}