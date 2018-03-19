package demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ͨ�������ȡclass�ļ��Ĺ��췽�������й��췽��
 * ���й��췽�� ��������
 * ���䣺
 * 		��ȡclass�ļ�����
 * 		��class�ļ����л�ȡ��Ҫ������
 */

public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// ��ȡclass�ļ�����
		Class c = Class.forName("demo01.Person");
		
		// ��ȡPerson���еĹ��췽��
		Constructor[] ct = c.getConstructors();
		for (Constructor c_: ct) {
			System.out.println(c_);
		}
		
		// ��ȡָ���Ĺ��췽�� �ղι���
		// ... �ɱ����
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor();
		// ��ȡ���췽��
		Object obj = con.newInstance();
		System.out.println(obj);
		
		// ���÷���
		// Ҫʹ�� Person �еķ�������ǿתΪPerson����
		Person p = (Person)obj;
		p.eat();
	}
}
