public class IfDemo3{
	public static void main(String[] args){
			//if������Ԫ������Ļ���
			int i = 5;
			int j = 6;
			
			//ʹ��if������ж����ֵ
			/*if(i > j){
				System.out.println(i + "�����ֵ");
			}else{
				System.out.println(j + "�����ֵ");
			}*/
			
			//ʹ����Ԫ�����
			int k = i > j ? i:j;
			System.out.println(k + "�����ֵ");
		
	}
}