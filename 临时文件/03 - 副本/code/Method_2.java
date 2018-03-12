public class Method_2{
	public static void main(String[] args){
		//测试：
		double sum = getSum(1,2.1);
		System.out.println(sum);
	}
	
	private static double getSum(double a ,int b){
		System.out.println("两个double参数");
		return a+b;
	}
	
}