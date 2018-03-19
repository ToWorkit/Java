package cn.itstar.demo05;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "喜洋洋";
		p2.name = "美羊羊";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		//对象调用静态成员变量
		p1.className = "七班";
		System.out.println(p2.className);
		
		//静态变量 可以直接被类名调用
		System.out.println(Person.className);
				
	}
	
}
