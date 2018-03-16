package com.itstar.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �����еĵ�����
 * 		��ȡ������Ԫ�صķ�ʽ
 * �ӿ�Iterator:�������󷽷�
 * 		boolean hasNext() �жϼ����л���û�пɱ�ȡ����Ԫ�أ��еĻ�����true
 * 		next() ȡ�����ϵ���һ��Ԫ��
 * 
 * Collection�ӿ��ж����˷���->iterator() ���ص���iterator�ӿڵ�ʵ�������
 * 
 * ʹ��ArrayList���϶���
 * 		Iterator it = array.iterator(); �õ�Iterator�ӿڵ�ʵ�������
 *      it�ǽӿڵ�ʵ�������,�����˷���hasNext��next()����Ԫ�صĵ���
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("aaa1");
		coll.add("aaa2");
		coll.add("aaa3");
		
		Iterator<String> it = coll.iterator();
//		boolean b = it.hasNext();//�ж��Ƿ���Ԫ��
//		Object s = it.next();
//		System.out.println(s);
		
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
	}
}
