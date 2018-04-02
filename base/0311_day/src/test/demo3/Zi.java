package test.demo3;

public class Zi extends Fu{
	int a = 2;
	
	public void show() {
		int a = 3;
		System.out.println(a + " a, 局部变量");
		
		System.out.println(this.a + " this.a, 成员变量");
		
		System.out.println(super.a + " super.a, 父类中的成员变量");
	}
}
