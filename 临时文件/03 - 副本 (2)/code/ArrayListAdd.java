
import java.util.ArrayList;
public class ArrayListAdd{
	public static void main(String[] args){
		//���弯��
		ArrayList<String> array = new ArrayList<String>();
		//���ü��Ϸ���add���Ԫ��
		array.add("aaabbb");
		array.add("itstar");
		array.add("love");
		array.add("you");
		
		//������ϵĳ���
		int size = array.size();
		System.out.println(size);
		
		//��ȡ���ϵ��е�Ԫ��,����������һ���������Ǵ�0��ʼ
		String s = array.get(1);
		System.out.println(s);
	}
}