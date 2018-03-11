package test.demo2;

public class Person_01 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 返回为布尔值
	public boolean compare(Person_01 p) {
		// 谁调用this，this就指谁
		return this.age > p.age;
	}
}
