package cn.itstar.demo04;
/*
 * final修饰成员变量
 * 成员变量，在堆内存，具有默认值
 * final修饰的成员的变量，固定的不是内存的默认值
 * 固定的是，成员变量的手动赋值，绝对不是内存的赋值
 * 
 * 成员变量的赋值，2中实现方式，一种是定义的时候，直接=赋值
 * 另一种赋值方式，采用构造方法赋值
 * 保证：被final修饰的成员变量只能赋值一次
 * 
 * 成员变量，需要自创建对象前赋值，否则报错。原因 构造器在创建对象前执行，set方法不可以，set方法在建完对象调用
 */
public class Person {
	//final int age;不可以
	final int age = 1;//可以
	
	/*这样可以，构造器赋值也行，只要是一次赋值就可以
	 * final int age;
	
	public Person(int age) {
		this.age = age;
	}*/
	
	
}
