import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		// ���弯�� ���Զ��弯�ϴ洢����������
		// ��������<���ϴ洢����������> ������ = new ��������<���ϴ洢����������>();
		/*
			8�ֻ����������Ͷ�Ӧ�������������ͱ�ʾ��ʽ
				byte             Byte
				short 		     Short
				int				 Integer
				long 			 Long
				float			 Float
				double    		 Double
				char			 Character
				boolean 		 Boolean
		*/
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// ��
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		// ����
		arr.add(2, 6);
		// ��
		arr.set(0, 9);
		// ��
		//arr.get(0);
		 
		// ɾ
		arr.remove(1);
		
		// ����
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}