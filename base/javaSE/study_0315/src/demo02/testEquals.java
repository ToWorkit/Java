package demo02;

public class testEquals {
	public static void main(String[] args) {
		//��������
		Person p1 = new Person("����",18);
		Person p2 = new Person("����",19);
		
		boolean b = p1.equals(p2);
		System.out.println(b);
	}
}
