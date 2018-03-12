public class ArrayDemo{
	public static void main(String[] args){
		//定义一个数组
		//格式：数据类型[] 变量名 = new 数据类型[存储元素的个数];
		int[] arr = new int[4];
		System.out.println(arr);
		
		//通过索引的方式
		System.out.println(arr[1]);
		
		System.out.println(arr.length);
		
		//数组的元素赋值
		arr[1] = 3;
		System.out.println(arr[1]);
	}
}