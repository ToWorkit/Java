package demo01;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;


/*
 * JDK1.5֮����ֵİ�ȫ���ƣ���֤����İ�ȫ��
 * 		���ͣ�ָ�����ϴ洢Ԫ�ص����� <����>
 */

public class GenericDemo01 {
	public static void main(String[] args) {
		fun_01();
	}
	
	public static void fun() {
		// �ӷ�����Ϊ�˱�֤����İ�ȫ�ԣ�ֻ�������String����
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("bgc");
		// ������
//		coll.add(123);
		
	}
	
	public static void fun_01() {
		Collection coll = new ArrayList<>();
		coll.add("lo");
		coll.add("pl");
		// �Զ�װ�䣬��int����תΪ��Integer����
		coll.add(123);
		
		Iterator i = coll.iterator();
		
		// �ж��Ƿ�����һ��Ԫ��
/*		while(i.hasNext()) {
			// 123 ��ʱΪ Integer�����ǲ���ʹ�� String ǿת��, toString���ԣ� �ڶ���д��ʱ��ȫΪʲô
			String s = i.next().toString();
			System.out.println(s);
		}*/
		
		
		// �ж��Ƿ�����һ��Ԫ��
		while(i.hasNext()) {
//			System.out.println(i.next());
			// 123 ��ʱΪ Integer�����ǲ���ʹ�� String ǿת��
			String s = (String)i.next();
			System.out.println(s);
		}
	}
}
