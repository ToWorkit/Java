package test.demo3;

public class Zi extends Fu{
	int a = 2;
	
	public void show() {
		int a = 3;
		System.out.println(a + " a, �ֲ�����");
		
		System.out.println(this.a + " this.a, ��Ա����");
		
		System.out.println(super.a + " super.a, �����еĳ�Ա����");
	}
}
