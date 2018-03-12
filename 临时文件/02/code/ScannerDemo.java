
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		//System.in系统输入
		Scanner sc = new Scanner(System.in);
		
		//接收键盘输入，保证是整数
		int i = sc.nextInt();
		System.out.println(i+1);
	}
}