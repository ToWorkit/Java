package cn.itstar.demo10;
/*
 * 有名字对象，引用类型变量，可以反复使用
 * 匿名对象，没有引用变量，只能使用一次
 * 
 * 匿名对象可以当做参数传递
 * 匿名对象可以当做方法的返回值
 */
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//正常写法
		Person p = new Person();
		p.eat();
		
		//匿名写法
		new Person().eat();
		//两个不同的人在吃
		new Person().eat();
		
		/*
		 * 只能使用一次
		 * int i = new Scanner(System.in).nextInt();
		System.out.println(i);*/
		
		/*多次使用
		 * Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.next();*/
		
		//匿名对象可以直接作为参数传递
		method(new Person());
		
		//调用空参重载的method方法
		Person p1 = method();
		p1.eat();
		
	}
	
	//方法返回值是Person类型
	//方法return语句 ,返回的是这个类的对象
	public static Person method() {
		//Person p = new Person();这样写比较麻烦
		//return p;
		return new Person();
	}
	//重载的方法
	public static void method(Person p) {
		p.eat();
	}
}
