// 引入随机数包
import java.util.Random;
public class RandomDemo {
	public static void main(String[] args) {
		// 实例化
		Random r = new Random();
		
		// int整型的 0-49 之间的随机数
		int i = r.nextInt(50);
		System.out.println(i);
		
		// double浮点型 0-1
		double d = r.nextDouble();
		System.out.println(d);
	}
}