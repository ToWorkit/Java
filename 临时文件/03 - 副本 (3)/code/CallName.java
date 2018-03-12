import java.util.Random;
import java.util.ArrayList;
public class CallName{
	/*
		由于数组的定长，这里采用集合来优化
		String[] s = {"",""}
	*/
	public static void main(String[] args){
		//定义集合 存储学生姓名
		ArrayList<StudentName> array = new ArrayList<StudentName>();
		//调用添加方法
		add(array);
		//调用遍历集合方法 实现预览
		printArrayList(array);
		
		System.out.println("====================");
		//调用随机数
		randomStudentName(array);
	}
	//产生随机数，Random
	public static void randomStudentName(ArrayList<StudentName> array){
		Random r = new Random();
		//拿到随机数
		int number = r.nextInt(array.size());
		//作为索引 到集合当中查找
		StudentName s = array.get(number);
		System.out.println(s.name + "  " + s.age);
	}
	
	//总览学生的信息，遍历集合
	public static void printArrayList(ArrayList<StudentName> array){
		for(int i = 0;i < array.size();i++){
			StudentName s = array.get(i);
			System.out.println(s.name+ "   " +s.age );
		}
	}
	
	//向集合中加入学生信息
	public static void add(ArrayList<StudentName> array){
		//创建StudentName的类型变量
		StudentName sn1 = new StudentName();
		StudentName sn2 = new StudentName();
		StudentName sn3 = new StudentName();
		StudentName sn4 = new StudentName();
		
		sn1.name = "迪丽热巴";
		sn1.age = 18;
		
		sn2.name = "杨幂";
		sn2.age = 20;
		
		sn3.name = "赵敏";
		sn3.age = 24;
		
		sn4.name = "柳岩";
		sn4.age = 33;
		
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
	}
	
}