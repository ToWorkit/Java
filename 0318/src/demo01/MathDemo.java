package demo01;

public class MathDemo {
	public static void main(String[] args) {
		fun_06();
		System.out.println(abs(-1)); // 1
	}
	
	/*
	 * long round(double a) 
	 * 获取参数4舍5入的值 取整数
	 */
	public static void fun() {
//		double a = Math.round(4.678); // 5.0
		
		double a = Math.round(-3.12); // -3.0
		System.out.println(a);
	}
	
	/*
	 * double random() 返回 随机数0.0-1.0之间
	 * 来源自Random类
	 */
	public static void fun_01() {
		for (int i = 0; i < 10; i ++) {
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	/*
	 * double sqrt(double a) 
	 * 返回参数的平方根
	 */
	public static void fun_02() {
//		double d = Math.sqrt(4); // 2.0
		// 注意负数没有平方根
		double d = Math.sqrt(-4); //NaN 
		System.out.println(d);
	}
	
	/*
	 *  double pow(double a, double b) 
	 *  a的b次方
	 */
	public static void fun_03() {
		double d = Math.pow(2, 3); // 8.0
		System.out.println(d);
	}
	
	
	/*
	 *  double floor(double a) 
	 *  向下取整
	 */
	public static void fun_04() {
		double d = Math.floor(1.92); // 1.0
		// 负数注意点
		double a = Math.floor(-2.9); // -3.0
		System.out.println(a);
	}
	
	/*
	 * double ceil(double a) 
	 * 向上取整
	 */
	public static void fun_05() {
		double d = Math.ceil(1.001); // 2.0
		// 负数注意点
		double a = Math.ceil(-1.001); // -1.0
		System.out.println(a);
	}
	
	/*
	 * double abs(int a) 
	 * 获取参数的绝对值
	 */
	public static void fun_06() {
		double d = Math.abs(-6);
		System.out.println(d);
	}
	
	// 自己实现
	public static int abs(int i) {
		int i_ = i < 0 ? -i : i;
		return i_;
	}
}
