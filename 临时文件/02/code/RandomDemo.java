
import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
		Random ran = new Random();
		
		//int i = ran.nextInt(50);
		//System.out.println(i);//0~49
		
		double d = ran.nextDouble();
		System.out.println(d);
	}
}