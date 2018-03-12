public class ASCIIDemo{
	/*
		char转换为int类型的时候，类型自动提升,char数据类型，会去查询编码表，得到整数
	*/
	public static void main(String[] args){
		char c = 'a';
		int i = c + 1;
		System.out.println(i);//98
		
		int j = 90;
		//强制类型转换
		char h = (char)j;
		System.out.println(h);//Z
		
		System.out.println((char)6);
		
		char k = '你';
		System.out.println(k);
		
		//char类型的范围0-65535
		char n = 70000;
	}
}