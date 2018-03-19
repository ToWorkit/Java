package demo01;

public class Person {
	// 修饰符 默认为default
	public String name;
	public int age;
	// 测试变量配合 06
	private int id;
	protected int test_01;
	
	// 最终变量，常量，不允许修改
	final int id_01 = 1;
	
	// 自身的方法
	public void eat() {
		System.out.println("总得吃饭吧");
	}
	public void sleep(String str, int i) {
		System.out.println(str + "---" + i);
	}
	
	// 无参构造方法
	public Person() {
		super();
	}
	// 有参
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 开放外部访问的权限
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 重写的toString方法
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
