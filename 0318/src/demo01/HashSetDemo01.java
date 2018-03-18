package demo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set�ӿڣ��ص㣺���ظ�Ԫ�أ�û����
 * 
 * Set�ӿڵ�ʵ���ࣺHashSet(��ϣ��)
 * �ص㣺���򼯺ϣ��洢��ȡ��Ԫ�ص�˳��ͬ��û�����������洢�ظ�Ԫ��
 * 
 */

public class HashSetDemo01 {
	public static void main(String[] args) {
		// Set�ӿڵ�ʵ����
		Set<String> s = new HashSet<String>();
		s.add("a");
		s.add("a");
		s.add("b");
		s.add("d");
		s.add("c");
		
		// ����
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------");
		
		// for
		for(String si: s) {
			System.out.println(si);
		}
		
		String str = new String("abc");
		// Դ���е� hashCode�㷨
/*	   public int hashCode() {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = value;

	            for (int i = 0; i < value.length; i++) {
	                h = 31 * h + val[i];
	            }
	            hash = h;
	        }
	        return h;
	    }*/
		// 96354
		System.out.println(str.hashCode());
	}
}
