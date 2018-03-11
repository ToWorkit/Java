import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		// 定义集合 可自定义集合存储的数据类型
		// 数据类型<集合存储的数据类型> 变量名 = new 数据类型<集合存储的数据类型>();
		/*
			8种基本数据类型对应的引用数据类型表示形式
				byte             Byte
				short 		     Short
				int				 Integer
				long 			 Long
				float			 Float
				double    		 Double
				char			 Character
				boolean 		 Boolean
		*/
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 增
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		// 插入
		arr.add(2, 6);
		// 改
		arr.set(0, 9);
		// 查
		//arr.get(0);
		 
		// 删
		arr.remove(1);
		
		// 遍历
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}