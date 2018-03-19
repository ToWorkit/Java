package demo01;

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

public class IterationDemo {
	public static void main(String[] args) {
		// ��̬
		Collection<String> coll = new ArrayList<String>();
		coll.add("a1");
		coll.add("a2");
		coll.add("a3");
		
		// Collection�ӿ��ж����˷���
		// iterator() ���ص���iterator�ӿڵ�ʵ�������
		Iterator<String> it = coll.iterator();
		
		// �ж��Ƿ�����һ��Ԫ��
/*		boolean b = it.hasNext();
		// ȡ�����ϵ���һ��Ԫ��
		Object s =it.next();
		System.out.println(s);*/
		
		// ʹ��whileȫ����ȡ
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
