public class Operator2{
	public static void main(String[] args){
		System.out.println(true&false);
		
		int i = 1;
		int j = 4;
		
		//短路与，一边是false，另一边不运行（提升效率）
		System.out.println(3>4 && ++j>2);
		
		//短路或，一边是true,另一边就不运行了
		System.out.println(i>2 || 3==3);
	}
}