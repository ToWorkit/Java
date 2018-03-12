/*
	利用for循环,计算1+4的结果
	1 + 2 + 3  + 4 = 10
	1+2的和+3
	1+2+3的和+4
*/
public class ForDemo1{
	public static void main(String[] args){
		//定义变量，记录求和之后的结果
		int sum = 0;
		for(int i = 0;i <= 4;i++){
			sum = sum + i;
		}
		System.out.println(sum);
	}
}