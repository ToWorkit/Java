package demo03;

public class Init {
	public static void main(String[] args) {
		Person p = new Person("�в������췽��", 22);
		System.out.println(p.getName() + "---" + p.getAge());
		
		Person p1 = new Person();
		System.out.println(p1.getName() + "---" + p1.getAge());
	}
}
