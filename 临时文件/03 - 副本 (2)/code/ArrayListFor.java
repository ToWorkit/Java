import java.util.ArrayList;
public class ArrayListFor{
	public static void main(String[] args){
		//���弯��
		ArrayList<Integer> array = new ArrayList<Integer>();
		//���ü��Ϸ���add���Ԫ��
		array.add(15);
		array.add(16);
		array.add(17);
		array.add(18);
		
		//������2�����Ԫ��7
		array.add(2,7);
		
		//������2�Ͻ�Ԫ��7�޸ĳ�100
		array.set(2,100);
		
		//ɾ��ָ�������ϵ�Ԫ��
		array.remove(1);
		
		//���ϵ��еı���
		for(int i = 0;i < array.size();i++){
			System.out.println(array.get(i));
		}
		
		
		
	}
}