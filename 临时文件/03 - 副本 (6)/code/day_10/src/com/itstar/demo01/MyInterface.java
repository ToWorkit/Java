package com.itstar.demo01;
/*
 * 定义接口
 * 		使用interface
 * 接口的定义：
 * 		成员方法，全抽象
 * 		不能定义带有方法体的方法
 * 定义抽象方法：固定格式
 * 
 * 	public abstract 返回值类型 方法的名字（参数列表）;
 * 
 * 接口当中的成员变量的定义：
 * 		要求：必须定义为常量
 * 		固定的格式：
 * 			标准写法
 * 		public static final 数据类型 变量名 = 值;
 */
public interface MyInterface {
	//接口当中的成员变量必须为常量
	public static final int a = 1;
	
	//在接口中，定义抽象方法
	public abstract void function();
}
