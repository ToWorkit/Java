package demo04;

/*
 * �����쳣
 */

public class ExceptionDemo04 {
	public static void main(String[] args) {
		double b = getArea(0);
		System.out.println(b);
	}
	/*
	 * �����
	 */
	public static double getArea(double r) {
		if (r <= 0)
			throw new RuntimeException("�����쳣��Բ�β�����");
		return Math.PI * r * r;
	}
}
