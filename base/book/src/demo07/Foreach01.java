package demo07;

import java.util.ArrayList;
import java.util.Iterator;

public class Foreach01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		
/*		// ��ͨ��forѭ��ɾ��Ԫ��
		for(int i = 0; i < list.size(); i++) {
			// list.get(i) -> ��ͨforѭ��ȡֵ
			if ("c".equals(list.get(i))) {
				list.remove(i--);
			}
		}
		System.out.println(list); // [a, b, d]
*/	
		
/*		// ��������ʽ
		for(Iterator<String> it = list.iterator(); it.hasNext();) {
			// it.next() -> ����ȡֵ
			if ("d".equals(it.next())) {
				// ����ʹ�ü��ϵ�ɾ����������Ϊ������������������޸Ļ�����޸��쳣
				list.remove("d");
			}
		}
		// Exception in thread "main" java.util.ConcurrentModificationException
		System.out.println(list);*/
		
		for(String string: list) {
			if ("b".equals(string)) {
				// ͬ��������ɾ����ֻ�ܱ���
				list.remove("b");
			}
		}
		// Exception in thread "main" java.util.ConcurrentModificationException
		System.out.println(list);
	}
}
