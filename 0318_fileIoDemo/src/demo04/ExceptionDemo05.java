package demo04;

/*
 * 自定义运行异常
 */

public class ExceptionDemo05 {
	public static void main(String[] args) {
		int avg = getAvg(90, 0 , 43, -100, 100);
		System.out.println(avg);
	}
	/*
	 * 传递参数，计算平局值
	 */
	// ... 不定参数
	public static int getAvg(int...math) {
		int sum = 0;
		for(int s: math) {
			if (s < 0) {
				throw new FuShuException("成绩无效" + s);
			}
			sum += s;
		}
		return sum / math.length;
	}
}
