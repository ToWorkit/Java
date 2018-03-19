package demo02;

public class Init {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.fun();
		z.show();
		
		// final 修饰的值不可变，但地址可变
		final int i = 2;
//		i = 10;
		// 并未修改值
		int j = i + 1;
		System.out.println(i);
	}
}
