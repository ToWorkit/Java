package com.itstar.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		//���Ͽ��Դ洢�������͵Ķ���
		//�����в�ָ���洢����������
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add(123);
		coll.add("dsadwqqwdqw");
		
		//�������Ļ�ȡ
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			//it.next()��ȡ��������ʲô���ͣ�
			//Object obj = it.next();
			//System.out.println(obj);
			
			//ת��
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}
