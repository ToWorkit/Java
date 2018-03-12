package com.itstar.demo04;
/*
 * 描述人的这个事物：
 * 		属性：姓名 年龄
 * 		方法：说话
 * 
 * 新的关键字：private 私有的 属于 成员修饰符 不能修饰局部变量
 * 			被private修饰，只能在自己的本类中使用->权限修饰
 * 对私有的变量，提供了公共的访问方式：方法
 */
public class Person {
	//人的姓名,成员变量
	String name;
	//人的年龄,成员变量-》安全问题 负值（不会导致程序挂掉） 但是违背了现实的情况
	private int age;
	
	//变量age被我们私有，提供方法让外部类使用
	public void setAge(int a) {
		//对a进行范围的限制
		if(a<0 || a>200) {
			age = 18;
		}else {
			age = a;
		}
	}
	
	//定义方法，对变量age获取值使用
	public int getAge() {
		return age;
	}
	
	//定义人说话的功能
	public void speak() {
		System.out.println(name+"...."+age+"说话中");
	}
}
