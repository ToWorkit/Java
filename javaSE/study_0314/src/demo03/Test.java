package demo03;

public class Test {
	public static void main(String[] args) {
		System.out.println("2018年3月14日12:20:22");
		// 特有数据操作
		Person p1 = new Person();
		p1.name = "痛惜";
		System.out.println(p1.name);
		
		// 共享数据操作
		p1.className = "霍金";
		System.out.println(p1.className);
	}
}
