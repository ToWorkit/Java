package com.itstar.demo01;
/*
 * 获取class文件的三种方式
 *  1.对象获取
 *  2.类名.获取
 *  3.Class类的静态方法获取
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.对象获取
		//Person p = new Person();
		//调用Person类的方法getClass方法来获取class文件
		//Class c = p.getClass();
		//System.out.println(c);
		
		//2.类名.获取
		Class c1 = Person.class;
		System.out.println(c1);
		
		// 3.Class类的静态方法获取
		//forName(String className) 
		
		Class c2 = Class.forName("com.itstar.demo01.Person");
		System.out.println(c2);
		
		//System.out.println(c == c1);//true 内存  类的加载器只会创建一个
		//System.out.println(c.equals(c1));//true 属性值
		
	}
}
