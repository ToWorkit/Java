package demo01;

/*
 * 反射，对.class文件进行加载解析并使用其拥有的资源属性
 * 
 * 获取.class文件的三种方式
 * 1. 对象 获取
 * 2. 类名. 获取
 * 3. Class类的静态方法 获取
 */

public class ReflectDemo01 {
	public static void main(String[] args) throws Exception {
		// 对象 获取
		// 会调用无参构造方法，Person中的无参构造方法必须是 非private 状态下的
		Person p = new Person();
		// 调用实例化类的getClass方法获取.class文件
		Class c = p.getClass();
		System.out.println(c);
		
		// 类名. 获取
		Class c_01 = Person.class;
		System.out.println(c_01);
		
		// 静态方法获取
		// 包名.类名
		Class c_02 = Class.forName("demo01.Person");
		System.out.println(c_02);
	}
}
