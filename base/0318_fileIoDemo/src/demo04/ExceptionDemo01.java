package demo04;

/*
 * 异常的关键字：
 * 	 throw，在方法的内部抛出异常的对象
 *   throw 后面必须new 对象，后面抛出异常类对象，已有异常类才有可抛性
 *   
 *   方法中声明关键字throws -> 用在方法的声明上，标明此方法可能有问题, 请调用者处理
 *   
 */
public class ExceptionDemo01 {
	public static void main(String[] args) throws Exception {
		int[] arr = null;
		int i = getArray(arr);
		System.out.println(i);
	}
	
	public static int getArray(int[] arr) throws Exception {
		if (arr == null) {
			// 抛出异常
			throw new Exception("传递的数组不存在");
		} else if (arr.length == 0) {
			// 抛出
			throw new Exception("数组不能为空");
		}
		int i = arr[arr.length - 1];
		return i *2;
	}
}
