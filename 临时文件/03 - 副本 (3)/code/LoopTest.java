public class LoopTest{
	public static void main(String[] args){
		/*
			输出所有的英文字母
				1小写
				2大写
				52
			利用编码表来实现
			A-Z     65-90
			a-z     97-122
			
			思路：
				1.定义变量，保存小写a，保存大写A
				2.循环26次，输出定义好的变量
				每次循环，变量++
		*/
		//定义变量 保存字母
		char xiaoxie = 'a';
		char daxie = 'A';
		
		//循环
		for(int i = 0; i < 26;i++){
			System.out.println(xiaoxie + "  "+daxie);
			
			daxie++;
			xiaoxie++;
		}
	}
}