/*
	for循环的编写格式：
	for(初始化表达式;循环条件;操作表达式){
		执行语句
		...
	}
	初始化表达式：定义变量，作用，控制循环的次数
	条件：当条件为true的时候，执行循环体,当条件为false时，结束循环
	增量：变量自增的情况
	
*/
public class ForDemo{
	public static void main(String[] args){
		//循环从0~10
		for(int i = 0;i < 11;i++){
			System.out.println(i);
		}
	}
}