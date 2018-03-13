package com.itstar.demo09;
/*
 * 在程序中，我们把固定不变的值设置为静态变量，之后记住变量名就可以了
 * 
 * 注意：接口中，每个成员变量默认使用的是 public static final修饰
 * 		接口当中的成员变量已经是静态变量了，由于接口当中没有构造方法，所以必须显示赋值，可以直接
 * 		用接口名访问
 * 
 * 	开发中，如果想在类中定义一个静态变量，通常使用public static final 修饰变量完成定义
 *  此时，变量名要全部大写，多个单词用下划线连接
 */
public class Static {
	public static final double PAI = 3.141231231312312312321;
	
	public static void main(String[] args) {
		System.out.println(PAI);
	}
}
