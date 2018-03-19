package cn.itstar.demo09;
/*
 * 在程序中，我们把固定不变的值设置为静态常量，之后只要记住变量名就可以了
 * 
 * 注意：接口中，每个成员变量都默认使用public static final修饰
 * 		所有接口中的成员变量已是静态变量，由于接口没有构造方法，所以必须显示赋值，可以直接用接口名访问。
 * 	开发中，我们想在类中定义一个静态变量，通常使用public static final 修饰变量来完成定义
 *  此时变量名用全部大写，多个单词使用下划线连接。
 */
public class Static {
	public static final double PAI = 3.14;
	public static void main(String[] args) {
		
		System.out.println(PAI);
	}
}
