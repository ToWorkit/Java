package demo07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		
//		demo01();
		demo02();
		
/*		// ����ת������ʱ�����鳤�������С�ڵ��ڼ��ϵ�sizeʱ��ת��������鳤�ȵ��ڼ��ϵ�size
		// ����ĳ��ȴ���size�����������鳤�Ⱦͺ�ָ���ĳ���һ��
		String[] arr = list.toArray(new String[10]);
		for(String string: arr) {
			b
			c
			c
			d
			null
			null
			null
			null
			null
			System.out.println(string);
		}*/
	}
	
	public static void demo02() {
/*		int[] arr = {1, 2, 3, 4, 5};
		// �����������͵�����ת���ɼ��ϣ��Ὣ�������鵱��һ������ת��
		List<int[]> list = Arrays.asList(arr);*/
		
		// ����ת�ɼ���ʱ��������������������
		Integer[] arr = {1, 2, 3, 4, 5};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list); //  [1, 2, 3, 4, 5]
	}
	
	public static void demo01() {
		String[] arr = {"a", "b", "c"};
		List<String> list = Arrays.asList(arr);
		// Exception in thread "main" java.lang.UnsupportedOperationException
		// ��֧����Ӳ���
//		list.add("d");
		System.out.println(list);
	}
}
