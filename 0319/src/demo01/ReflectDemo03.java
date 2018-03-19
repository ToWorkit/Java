package demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ͨ�������ȡ�вι���
 */

public class ReflectDemo03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("demo01.Person");
		//getConstructor(Class<?>... parameterTypes)
		// ��������
		Constructor con = c.getConstructor(String.class, int.class);
		// newInstance() ����
		Object obj = con.newInstance("xx", 12);
		System.out.println(obj);
		System.out.println(((Person)obj).getName());
	}
}
