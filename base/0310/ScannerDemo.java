// java的接受键盘输入的包
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		// System.in 系统输入
		// 数据类型，变量名称，new，数据类型
		Scanner sc = new Scanner(System.in);
		
		// 接受键盘输入的数据，并保证是 int 整型
		int i = sc.nextInt();
		System.out.println(i + 1);
	}
}
