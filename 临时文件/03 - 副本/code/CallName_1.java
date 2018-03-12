import java.util.Random;
public class CallName_1{
	public static void main(String[] args){
		//定义数组 存储学生姓名->共性
		String[] names = new String[5];
		//添加学生
		addStudent(names);
		//预览学生
		printStudentName(names);
		
		System.out.println("=======================");
		
		//随机姓名
		String xingming = randomStudentName(names);
		System.out.println(xingming);
		
	}
	/*
		定义方法：随机数，作为索引，根据索引找到学生姓名
		返回值?学生
		参数?数组
	*/
	public static String randomStudentName(String[] names){
		//定义随机数
		Random rc = new Random();
		//做索引
		int index = rc.nextInt(names.length);
		//返回值
		return names[index];
	}
	
	/*
		定义方法实现预览
		返回值?无
		参数?数组
	*/
	public static void printStudentName(String[] names){
		for(int i = 0;i < names.length;i++){
			System.out.println(names[i]);
		}
	}
	
	/*
		向数组当中添加学生姓名
		返回值?无
		参数？参数就是数组
	*/
	public static void addStudent(String[] names){
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "赵六";
		names[4] = "hunter";
		
	}
	
}