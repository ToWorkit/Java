package demo01;

import java.lang.reflect.Constructor;

public class ReflectDemo05 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("demo01.Person");
		
		// ��ȡ���еĹ��췽��
		Constructor[] con = c.getDeclaredConstructors();
		for(Constructor c_item: con) {
			System.out.println(c_item);
		}
		
		System.out.println("-----------------");
		
		// ֻ��ȡ�޲ι��췽��(���ݲ�����Ϊ�в�)
		Constructor con_null = c.getDeclaredConstructor();
		System.out.println(con_null);
		
		System.out.println("-----------------");
		
		// ָ����ȡ(�в�)
		Constructor con_me = c.getDeclaredConstructor(String.class, int.class);
		System.out.println(con_me);
		
		// �������� ȡ������ʱȨ�޼�� ���Ƽ� �ƻ��˳���ķ�װ�� ����ȫ��
		con_me.setAccessible(true);
		// ��ȡ��֮��ʹ�� newInstance ʵ����
		Object obj = con_me.newInstance("xx", 21);
		System.out.println(obj);
	}
}
