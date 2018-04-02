package demo03;
/*
 * this可以在构造方法之间进行调用
 * this.的方式,区分成员变量与局部变量之间的重名情况
 * this在构造方法之间的调用，语法this()
 */
public class Person {
	String name;
	int age;
	int id;
	
	public Person() {
//		this("李四",20, 2); -> 隐式代码 -> set 操作
		name = "李四";
		age = 20;
		id = 2;
		//参数李四，20 传递给了变量name age
		//this("李四",20);this的作用，直接赋值
		//注意：this调用构造方法的时候要在第一行
		
	}

	//构造方法的目的就是在new的时候可以直接为你的成员变量赋值
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println('-'); // 测试this，实际证明无参数调用时不会被调用
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
