package demo04;

/*
 * 运行异常
 */

public class ExceptionDemo04 {
	public static void main(String[] args) {
		double b = getArea(0);
		System.out.println(b);
	}
	/*
	 * 求面积
	 */
	public static double getArea(double r) {
		if (r <= 0)
			throw new RuntimeException("运行异常，圆形不存在");
		return Math.PI * r * r;
	}
}
