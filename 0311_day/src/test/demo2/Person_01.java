package test.demo2;

public class Person_01 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// ����Ϊ����ֵ
	public boolean compare(Person_01 p) {
		// ˭����this��this��ָ˭
		return this.age > p.age;
	}
}
