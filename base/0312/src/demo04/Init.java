package demo04;

/*
 * 多态的特点：
 * 
 * 	成员变量：
 * 		编译的时候，参考父类中有没有这个变量，如果有编译成功，如果没有编译失败
 * 		运行的时候，运行的是父类中的变量值
 * 
 *  成员方法：
 *  	编译的时候，参考父类中有没有这个方法，如果有编译成功，如果没有编译失败
 *  	运行的时候，运行的是子类重写的方法
 */


public class Init {
	public static void main(String[] args) {
		Fu f = new Zi();
		System.out.println(f.a);
		
		f.show();
		
		// 不允许使用子类独有的属性
//		f.only();
		
		// 
		Zi.only();
	}
}
