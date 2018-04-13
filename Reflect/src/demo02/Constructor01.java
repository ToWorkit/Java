package demo02;

import java.lang.reflect.Constructor;

import demo01.Person;

/**
 * Class���newInstance()������ʹ�ø����޲εĹ��캯����������, ���һ����û���޲εĹ��캯��,
 * �Ͳ�������������,���Ե���Class���getConstructor
 * (String.class,int.class)������ȡһ��ָ���Ĺ��캯��Ȼ���ٵ���Constructor���newInstance
 * ("����",20)������������
 * @throws Exception 
 */

public class Constructor01 {
	public static void main(String[] args) throws Exception {
		Class cl = Class.forName("demo01.Person");
		// ͨ���޲ι��촴������
/*		Person p = (Person)cl.newInstance();
		System.out.println(p);*/
		
		// ��ȡ�вι���
		Constructor c = cl.getConstructor(String.class, int.class);
		// ͨ���вι��촴������
		Person p = (Person)c.newInstance("��", 20);
		
		System.out.println(p);
	}
}
