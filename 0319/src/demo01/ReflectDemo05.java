package demo01;

import java.lang.reflect.Constructor;

public class ReflectDemo05 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("demo01.Person");
		
		// 获取所有的构造方法
		Constructor[] con = c.getDeclaredConstructors();
		for(Constructor c_item: con) {
			System.out.println(c_item);
		}
		
		System.out.println("-----------------");
		
		// 只获取无参构造方法(传递参数则为有参)
		Constructor con_null = c.getDeclaredConstructor();
		System.out.println(con_null);
		
		System.out.println("-----------------");
		
		// 指定获取(有参)
		Constructor con_me = c.getDeclaredConstructor(String.class, int.class);
		System.out.println(con_me);
		
		// 暴力反射 取消运行时权限检查 不推荐 破坏了程序的封装性 ，安全性
		con_me.setAccessible(true);
		// 获取到之后使用 newInstance 实例化
		Object obj = con_me.newInstance("xx", 21);
		System.out.println(obj);
	}
}
