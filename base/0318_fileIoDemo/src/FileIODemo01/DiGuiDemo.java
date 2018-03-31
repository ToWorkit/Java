package FileIODemo01;

public class DiGuiDemo {
	public static void main(String[] args) {
		int i = getJc(3);
		System.out.println(i);
		int j = getOp(3, 1);
		System.out.println(j);
		
		int a = getSum(100);
		System.out.println(a);
		int b = getSumOp(100, 1);
		System.out.println(b);
	}
	
	/*
	 * 阶乘
	 */
	public static int getJc(int i) {
		if (i == 1)
			return 1;
		return i * getJc(i - 1);
	}
	
	/*
	 * 递归尾调用优化 
	 */
	public static int getOp(int i,int j) {
		if (i == 1)
			// 直接返回已经计算好的结果
			return j;
		// 传入参数调用函数之前就计算好了结果，函数不参与运算
		return getOp(i - 1, i * j);
	}
	
	/*
	 * 求和
	 */
	public static int getSum(int i) {
		if (i == 1)
			return 1;
		return i + getSum(i - 1);
	}
	
	/*
	 * 尾调用优化
	 */
	public static int getSumOp(int i, int j) {
		if (i == 1)
			return j;
		return getSumOp(i - 1, i + j);
	}
}
