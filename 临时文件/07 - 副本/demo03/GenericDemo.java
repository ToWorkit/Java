package com.itstar.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * JDK1.5֮����ֵİ�ȫ���ƣ���֤����İ�ȫ��
	 * 		���ͣ�ָ�����ϴ洢Ԫ�ص����� <����>
	 */
	
	public static void function() {
		
		// �ӷ�����Ϊ�˳���İ�ȫ�� ��ֻ�������String
		// Collection<String> coll = new ArrayList<String>();
		
		
		Collection coll = new ArrayList<>();
		coll.add("abc");
		coll.add("bbc");
		// �������Զ�װ�䣬תΪ�� Integer ���ͣ�������ǿתString��int�����ǿ���ǿתString�� -> ����֤
		coll.add(123);
		
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			// ���淢�����Զ�װ�䣬תΪ�� Integer ���ͣ�������ǿתString��int�����ǿ���ǿתString��
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}
