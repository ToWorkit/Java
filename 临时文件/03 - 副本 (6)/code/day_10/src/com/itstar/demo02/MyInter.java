package com.itstar.demo02;
/*
 * 1.接口中成员变量的特点,没有变量，只有常量
 *   固定的格式：public static final 数据类型 变量名 = 值;
 *   	public 权限  最大权限 共有的
 *   	static 静态 加了静态的内容可以直接被类名.调用(以前创建对象，用对象来调用)
 *   	final 最终 固定住了变量的值 不允许被改值
 *   注意：public static final 属于修饰符 ，在接口中定义可以省略不写
 *   	但是不写不等于没有
 *   	还是要写
 *   
 *   2.方法的格式：public abstract 返回值类型 方法名(参数列表)
 *   			也可以不写
 *   			还是要写
 *   3.实现类，实现接口，重点接口全部是抽象方法，创建实现类的对象
 *     只有把全部方法重写，才可以用子类对象
 *      
 */
public interface MyInter {
	//声明一个静态常量
	public static final int a = 1;
	
	void show();
}
