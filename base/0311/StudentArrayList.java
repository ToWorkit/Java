// 导入集合包
import java.util.ArrayList;
// 导入随机数包
import java.util.Random;
public class StudentArrayList {
	public static void main(String[] args) {
		// 集合为共有, 定义集合 存储学生姓名
		// 在同一文件夹下不需要导包
		ArrayList<StudentName> arr_stu = new ArrayList<StudentName>();
		
		/* 调用方法 */
		// 添加
		addStu(arr_stu);
		// 展示
		showStu(arr_stu);
		// 随机
		ranomStu(arr_stu);
	}
	// 添加, 不需要返回值, 接收 ArrayList<StudentName> 格式的参数
	public static void addStu(ArrayList<StudentName> array_stu) {
		// 添加多个学生, 格式为 自定义的类
		StudentName s1 = new StudentName();
		StudentName s2 = new StudentName();
		StudentName s3 = new StudentName();
		StudentName s4 = new StudentName();
		
		s1.name = "嗯呢";
		s1.age = 10;
		
		s2.name = "嗯嗯";
		s2.age = 21;
		
		s3.name = "好的";
		s3.age = 24;
		
		s4.name = "嗯";
		s4.age = 25;
		
		// 添加到集合当中
		array_stu.add(s1);
		array_stu.add(s2);
		array_stu.add(s3);
		array_stu.add(s4);
	}
	// 展示
	public static void showStu(ArrayList<StudentName> array_stu) {
		for (int i = 0; i < array_stu.size(); i++) {
			System.out.println(array_stu.get(i).name + " " + array_stu.get(i).age);
		}
	}
	// 随机选取
	public static void ranomStu(ArrayList<StudentName> array_stu) {
		// 随机
		Random i = new Random();
		// int类型的随机数, 参数为集合的长度 0 ~ array_stu.size() - 1
		int rom = i.nextInt(array_stu.size());
		
		/*
		StudentName s = array_stu.get(rom);
		s.name
		s.age
		*/
		
		// 随机选取
		System.out.println(array_stu.get(rom).name + " " + array_stu.get(rom).age);
	}
}