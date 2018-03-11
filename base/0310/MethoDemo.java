public class MethoDemo {
	public static void main(String[] args) {
		// 调用方法
		int area = getArrea(3, 3);
		System.out.println("面积为：" + area);
		
		// 方法的重载
		int sum_int = getSum(2, 3);
		System.out.println(sum_int);
		
		double sum_double = getSum(3.2, 4.1);
		System.out.println(sum_double);
	}
	// 定义方法
	// 修饰符，返回值类型，方法名(参数列表) 
	public static int getArrea(int w, int h) {
		int area = w * h;
		return area;
	}
	
	// 方法的重载
	public static int getSum(int a, int b) {
		System.out.println("int参数方法");
		int sum = a + b;
		return sum;
	}
	
	public static double getSum(double a, double b) {
		System.out.println("double参数方法");
		double sum = a + b;
		return sum;
	}
}