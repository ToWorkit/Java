package demo01;

public class MathDemo {
	public static void main(String[] args) {
		fun_06();
		System.out.println(abs(-1)); // 1
	}
	
	/*
	 * long round(double a) 
	 * ��ȡ����4��5���ֵ ȡ����
	 */
	public static void fun() {
//		double a = Math.round(4.678); // 5.0
		
		double a = Math.round(-3.12); // -3.0
		System.out.println(a);
	}
	
	/*
	 * double random() ���� �����0.0-1.0֮��
	 * ��Դ��Random��
	 */
	public static void fun_01() {
		for (int i = 0; i < 10; i ++) {
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	/*
	 * double sqrt(double a) 
	 * ���ز�����ƽ����
	 */
	public static void fun_02() {
//		double d = Math.sqrt(4); // 2.0
		// ע�⸺��û��ƽ����
		double d = Math.sqrt(-4); //NaN 
		System.out.println(d);
	}
	
	/*
	 *  double pow(double a, double b) 
	 *  a��b�η�
	 */
	public static void fun_03() {
		double d = Math.pow(2, 3); // 8.0
		System.out.println(d);
	}
	
	
	/*
	 *  double floor(double a) 
	 *  ����ȡ��
	 */
	public static void fun_04() {
		double d = Math.floor(1.92); // 1.0
		// ����ע���
		double a = Math.floor(-2.9); // -3.0
		System.out.println(a);
	}
	
	/*
	 * double ceil(double a) 
	 * ����ȡ��
	 */
	public static void fun_05() {
		double d = Math.ceil(1.001); // 2.0
		// ����ע���
		double a = Math.ceil(-1.001); // -1.0
		System.out.println(a);
	}
	
	/*
	 * double abs(int a) 
	 * ��ȡ�����ľ���ֵ
	 */
	public static void fun_06() {
		double d = Math.abs(-6);
		System.out.println(d);
	}
	
	// �Լ�ʵ��
	public static int abs(int i) {
		int i_ = i < 0 ? -i : i;
		return i_;
	}
}
