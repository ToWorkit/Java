package demo01;

public class DataType02 {
	public static void main(String[] args) {
		float f = 12.3f;
		long x = 12345;
		
		// 隐式转换
		f = x;
		System.out.println(f);
		
		// 强制转换
/*		x = (long)f;
		System.out.println(x);*/
	}
}
