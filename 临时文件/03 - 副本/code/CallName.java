/*
	存储所有学生的姓名
	打印全班同学的名字：遍历
	在班级所有人中随机一个名字：根据索引产生随机数，查找
*/
import java.util.Random;
public class CallName{
	
	public static void main(String[] args){
		//存储姓名
		String[] names = {"张三","李四","王五","赵六"};
		for(int i = 0;i < names.length;i++){
			System.out.println(names[i]);
		}
		
		System.out.println("========================");
		//随机一个人
		Random r = new Random();
		//指定范围
		int index = r.nextInt(4);
		//根据索引找到元素
		System.out.println(names[index]);
	}
}