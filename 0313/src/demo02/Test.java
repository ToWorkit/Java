package demo02;

public class Test {
	public static void main(String[] args) {
		
		// 无参数构造方法
		Person p1 = new Person();
		p1.setName("无参数");
		p1.setAge(20);
		System.out.println(p1.getAge() + "---" + p1.getName());
		
		// 有参数构造方法
//		Person p2 = new Person("有参数", 22);
//		System.out.println(p2.getAge() + "---" + p2.getName());
		
	}
}
