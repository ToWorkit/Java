import java.util.ArrayList;
public class ArrayListFor{
	public static void main(String[] args){
		//定义集合
		ArrayList<Integer> array = new ArrayList<Integer>();
		//调用集合方法add添加元素
		array.add(15);
		array.add(16);
		array.add(17);
		array.add(18);
		
		//在索引2上添加元素7
		array.add(2,7);
		
		//在索引2上将元素7修改成100
		array.set(2,100);
		
		//删除指定索引上的元素
		array.remove(1);
		
		//集合当中的遍历
		for(int i = 0;i < array.size();i++){
			System.out.println(array.get(i));
		}
		
		
		
	}
}