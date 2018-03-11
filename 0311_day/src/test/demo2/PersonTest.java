package test.demo2;

public class PersonTest {
	public static void main(String[] args) {
		// 实例化
		Person p = new Person();
		// 调用开放的方法，对局部变量赋值
		p.setName("詹姆斯");
		p.setAge(20);
		p.speak();	
	}
}
