/*
	�洢����ѧ��������
	��ӡȫ��ͬѧ�����֣�����
	�ڰ༶�����������һ�����֣������������������������
*/
import java.util.Random;
public class CallName{
	
	public static void main(String[] args){
		//�洢����
		String[] names = {"����","����","����","����"};
		for(int i = 0;i < names.length;i++){
			System.out.println(names[i]);
		}
		
		System.out.println("========================");
		//���һ����
		Random r = new Random();
		//ָ����Χ
		int index = r.nextInt(4);
		//���������ҵ�Ԫ��
		System.out.println(names[index]);
	}
}