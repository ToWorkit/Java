1：基础语法->引用数据类型(类)
	Scanner类：键盘输入
	Random类：随机数
	
	两种：1->java提供好的类,这些类包含了很多方法和属性供我们使用。
		  2->我们自己创建的类，按照类的定义标准，类中可以包含多个方法和属性。
		  
	引用数据类型有3种：数组、类、接口（面向对象）
	
2：基础语法->自定义数据类型

	在java中，我们将现实当中的事物抽象成了代码，我们可以使用自定义的数据类型(类)，
	来描述现实生活中的事物，代码->生活
	
	不是java事前提供好的类。用来描述事物。
	
3：基础语法->自定义类的格式

	格式：
		public class 类名{
			属性定义->属于事物的特征
				修饰符  数据类型  变量名 = 值
					int age = 18;
				方法->功能
					修饰符 返回值类型 方法名(参数列表){
						
					}
		}
		
4：基础语法->两个引用数据类型的变量


5：基础语法->ArrayList创建变量的步骤

	->容器而已
	也是引用数据类型
	
	步骤：
		1.导入包 java.util包中
		2.创建引用数据类型的变量
			数据类型<集合存储的数据类型> 变量名 = new 数据类型<集合存储的数据类型>();
			集合存储的数据类型:要将数据（类型）存储到容器当中
			必须指定好存储的类型
			
		数组 int[] double[] 在创建数组的时候就已经指定好了数据类型
		
	注意：集合不存储基本数据类型，值存储引用数据类型
	
	8种基本数据类型对应的引用数据类型表示形式
		byte             Byte
		short 		     Short
		int				 Integer
		long 			 Long
		float			 Float
		double    		 Double
		char			 Character
		boolean 		 Boolean