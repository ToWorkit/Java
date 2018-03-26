package 位运算符;

public class demo01 {
	public static void main(String[] args) {
		/*
		* &,|,^,~ 的用法
		* &:有0则0
		* |:有1则1
		* ^:相同则0，不同则1
		* ~:按位取反
		 */
		System.out.println(6 & 3);				//2
		System.out.println(6 | 3);				//7
		System.out.println(6 ^ 3);				//5	
		System.out.println(~6);					//-7
	}
}
