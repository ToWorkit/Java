package com.itstar.demo01;
/*
 * 自定义的person类，成员变量,name age
 * 要求在new person的同时指定好name与age的值
 * 实现功能 ，医用方法去实现，构造方法
 * 作用：在new的同时对成员变量赋值 对对象初始化的时候对new Person的age name赋值
 * 
 * 构造方法的定义格式
 * 		权限 方法名(参数列表){
 * 		}
 */
public class Person {
	private String name;
	private int age;
	
	//创建构造方法
	public Person(String name,int age) {
		//System.out.println("我是一个空参的构造方法");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
