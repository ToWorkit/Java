package demo01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
	public static void main(String[] args) {
		fun();
	}
	
	/*
	 * Collection�ӿڵķ���
	 *  void clear()  ��ռ��ϵ��е�����Ԫ��
	 *  
	 * ����������Ȼ��
	 */
	public static void fun() {
		// ��̬��ʽ����
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("ghgh");
		coll.add("wewe");
		coll.add("qweq");
		System.out.println(coll);
		// ���
		coll.clear();
		coll.add("��");
		System.out.println(coll);
	}
}
