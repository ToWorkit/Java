public class IfDemo2{
	public static void main(String[] args){
			int grade = 15;
			
			if(grade > 90){
				System.out.println(grade + "你的成绩是优秀");
			}else if(grade > 70){
				System.out.println(grade + "你的成绩是中等");
			}else if(grade > 60){
				System.out.println(grade + "你的成绩是及格");
			}else{
				System.out.println(grade + "你的成绩是差");
			}
			
		
	}
}