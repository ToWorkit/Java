
import java.util.ArrayList;
public class ArrayListAdd{
	public static void main(String[] args){
		//定义集合
		ArrayList<String> array = new ArrayList<String>();
		//调用集合方法add添加元素
		array.add("aaabbb");
		array.add("itstar");
		array.add("love");
		array.add("you");
		
		//输出集合的长度
		int size = array.size();
		System.out.println(size);
		
		//获取集合当中的元素,集合与数组一样索引都是从0开始
		String s = array.get(1);
		System.out.println(s);
	}
}