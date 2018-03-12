1：基础语法->for循环

	最常见的循环语句。用在循环次数已知的情况下。
	for(初始化表达式;循环条件;操作表达式){
		执行语句
		...
	}
	
2：基础语法->循环语句do...while

	do...while循环语句和while循环语句类似,语法结构
	
	do{
		执行语句
		...
	}while(循环条件);
	
	while和do...while的区别：如果循环条件在循环语句开始就不成立，那么while循环体一次都不执行。
	do...while循环体会执行一次
	
3：基础语法->无限循环

	格式：
		while(true){
			
		}或
		for(;;){}
		
4：基础语法->嵌套for循环
	
	指一个循环语句中的循环体中再定义一个循环语句的语法结构。while,do...while,for
	
	外循环一次，内循环要循环完。
	
5：基础语法->跳转语句---break语句

	跳转语句用于实现循环执行过程中程序流程的跳转。、，属于关键字，停止的意思
	
		   ->continue关键字 继续
		   
		   作用：终止本次循环，开始下次循环。
		   
6：基础语法->流程控制语句switch(选择)

	它只能镇定某个表达式的值做出判断，从而决定程序执行哪段代码。
	
	case->穿透性
	
7：基础语法->数组

	java中，数组指一组数据的集合,数组中的每一个数据称为元素。在数组中可以存放任意元素，
	在同一个数组里，存放的元素类型必须一致。数组相当于容器。
	
	数组的length属性：使用->数组名.length
	数组的最小索引是0，最大的索引length-1
	
	数组的元素赋值：
	
	数组的定义：
		1->数据类型[] 变量名 = new 数据类型[]{元素1，元素2，元素3};
	
		2->数据类型[] 变量名 = {元素1，元素2，元素3};
		
	数组的遍历：
	
	数组的异常：数组的索引越界异常
				空指针异常
				
	数组获取最值的原理思想：
	
8：基础语法->二维数组

	int[][] arr = new int[3][4];