package demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过反射获取class文件的构造方法，运行构造方法
 * 运行构造方法 创建对象
 * 反射：
 * 		获取class文件对象
 * 		从class文件当中获取需要的属性
 */

public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 获取class文件对象
		Class c = Class.forName("demo01.Person");
		
		// 获取Person类中所有的构造方法(有参和空参)
		Constructor[] ct = c.getConstructors();
		for (Constructor c_: ct) {
			System.out.println(c_);
		}
		
		// 获取空参构造方法 
		// ... 可变参数
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor();
		System.out.println(con);
		// 获取构造方法
		Object obj = con.newInstance();
		System.out.println(obj);
		
		// 调用方法
		// 要使用 Person 中的方法，先强转为Person类型
		Person p = (Person)obj;
		p.eat();
	}
}
