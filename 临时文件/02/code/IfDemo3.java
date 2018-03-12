public class IfDemo3{
	public static void main(String[] args){
			//if语句和三元运算符的互换
			int i = 5;
			int j = 6;
			
			//使用if语句来判断最大值
			/*if(i > j){
				System.out.println(i + "是最大值");
			}else{
				System.out.println(j + "是最大值");
			}*/
			
			//使用三元运算符
			int k = i > j ? i:j;
			System.out.println(k + "是最大值");
		
	}
}