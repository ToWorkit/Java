package demo03;

public class Test {
	public static void main(String[] args) {
		//创建person对象
//		Person p = new Person("张三",18);
		//创建构造参数对象
		Person p = new Person();
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getId());
	}
}
