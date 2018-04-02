package demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过反射获取有参构造
 */

public class ReflectDemo03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("demo01.Person");
		//getConstructor(Class<?>... parameterTypes)
		// 不定参数
		Constructor con = c.getConstructor(String.class, int.class);
		// newInstance() 传参
		Object obj = con.newInstance("xx", 12);
		System.out.println(obj);
		System.out.println(((Person)obj).getName());
	}
}
