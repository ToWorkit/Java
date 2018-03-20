package demo02;

public class Person01 {
	private String name;
	private int age;
	public int id;
	
	// 构造方法
	public Person01() {
		super();
	}
	public Person01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// get和set方法
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
	
	// 重写toString方法
	public String toString() {
		return name + "---" + age;
	}
	// 重写hashCode方法
	public int hashCode() {
		// age ^ 10 越大，结果中重复的项会越来越靠后
		return name.hashCode() + age ^ 10;
	}
	// 重写equals方法返回true则是一样的值
	public boolean equals(Object obj) {
		// 调用者和被比较者
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// 属于Person01再进行强转比较
		if (obj instanceof Person01) {
			/*
			 *  强转的原因是 HashDemo01 中使用构造方法传参到 Person01 中
			 *  要比较两个 new 实例化后的对象，地址肯定是不一样的，所以只能比较实例化后传到 Person01 中的值看是否一致
			 *  一致则判断为重复
			 */
			Person01 p = (Person01)obj;
			// println 会自动调用 toString 方法
			System.out.println(obj);
			System.out.println(name);
			System.out.println(p.name);
			System.out.println(age);
			System.out.println(p.age);
			System.out.println(name.equals(p.name));
			return name.equals(p.name) && age == p.age;
		}
		// 都不满足直接返回false
		return false;
	}
}
