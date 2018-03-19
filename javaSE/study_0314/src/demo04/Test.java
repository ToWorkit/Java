package demo04;

/**
 * 
 * @author hedy
 *
 */

public class Test {
	public static void main(String[] args) {
		// 多态
		Fu f = new Zi();
		
		// 调用父类的静态成员变量
		System.out.println(f.a);
		
		// 父类的静态方法
		f.show();
		
		// 子类的静态方法
		Zi.show();
	}
}
