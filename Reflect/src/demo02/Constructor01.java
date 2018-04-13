package demo02;

import java.lang.reflect.Constructor;

import demo01.Person;

/**
 * Class类的newInstance()方法是使用该类无参的构造函数创建对象, 如果一个类没有无参的构造函数,
 * 就不能这样创建了,可以调用Class类的getConstructor
 * (String.class,int.class)方法获取一个指定的构造函数然后再调用Constructor类的newInstance
 * ("张三",20)方法创建对象
 * @throws Exception 
 */

public class Constructor01 {
	public static void main(String[] args) throws Exception {
		Class cl = Class.forName("demo01.Person");
		// 通过无参构造创建对象
/*		Person p = (Person)cl.newInstance();
		System.out.println(p);*/
		
		// 获取有参构造
		Constructor c = cl.getConstructor(String.class, int.class);
		// 通过有参构造创建对象
		Person p = (Person)c.newInstance("嗯", 20);
		
		System.out.println(p);
	}
}
