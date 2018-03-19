package demo04;

public class Init {
	public static void main(String[] args) {
		Person p = new Student();
		System.out.println(p.a);
		
		// Student  -> 可以有参数
		
		Student s = new Student();
		System.out.println(s.a);
	}
}
