package demo02;

public class Init {
	public static void main(String[] args) {
		Person p = new Person("xx", 22);
		System.out.println(p.getAge() + "---" + p.getName());
		
		Person p1 = new Person();
		p1.setName("ee");
		p1.setAge(11);
		System.out.println(p1.getAge() + "---" + p1.getName());
	}
}
