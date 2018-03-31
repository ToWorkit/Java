package demo04;

/*
 * 检查邮箱是否合法
 * 
 * 		规则：
 * 			123456@qq.com
 * 		    myemail@sina.com
 * 			myemail@163.com
 * 			myemail@yahoo.com.cn
 * 
 * @:前 数字 字母 下划线  个数不能小于1个
 * @:后 数字 字母  个数不能小于1个
 * .:后面 字母
 * 
 */

public class RegExpDemo03 {
	public static void main(String[] args) {
		String email = "Q123456@qq.com.cn";
		// 特殊邮箱，例如yahoo的
		// ()+ -> 括号内的规则出现一次到多次
		boolean b = email.matches("[\\w]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}
