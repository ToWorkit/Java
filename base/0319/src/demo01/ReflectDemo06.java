package demo01;

import java.lang.reflect.Field;

/*
 * 反射来获取成员变量，并且修改值
 * 	Person类成员String int
 */

public class ReflectDemo06 {
	public static void main(String[] args) throws Exception {
		// 获取 class
		Class c = Class.forName("demo01.Person");
		// 成员变量获取, 只获取公用成员变量
		Field[] files = c.getFields();
		for(Field f: files) {
			System.out.println(f);
		}
		System.out.println("===========");
		// 获取全部的(私有的, 最终的，受保护的...)
		Field[] files_on = c.getDeclaredFields();
		for(Field f_on: files_on) {
			System.out.println(f_on);
		}
		System.out.println("+++++++++++++++++++++");
		
		// 获取指定的成员变量
		Field file_in = c.getField("name");
		System.out.println(file_in);
		
		// 属性赋值
		Object obj = c.newInstance();
		file_in.set(obj, "赋值");
		System.out.println(obj);
	}
}
