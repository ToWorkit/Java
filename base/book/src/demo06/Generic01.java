package demo06;

import java.util.ArrayList;
import java.util.Iterator;

/**
* A:���͸���
* B:���ͺô�
	* ��߰�ȫ��(�������ڵĴ���ת����������) 
	* ʡȥǿת���鷳
* C:���ͻ���ʹ��
	* <>�зŵı����������������� 
* D:����ʹ��ע������
	* ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���)  
	* 
      ���͵�����:	
  	���ڵ�object���Ϳ��Խ�������Ķ�������, ��������ʵ�ʵ�ʹ���У���������ת�������⣬��������������java�ṩ����������������
*/


public class Generic01 {
	public static void main(String[] args) {
		demo01();
	}
	
	public static void demo01() {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("����", 20));
		list.add(new Person("����", 22));
		
		// ����
		Iterator<Person> it = list.iterator();
		
		// ��ȡ��һ��
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + "..." + p.getAge());
		}
	}
}
