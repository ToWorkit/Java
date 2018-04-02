package demo04;

/*
 * 异常的处理方式：
 * 	格式：
 * 		try...catch...finally
 * 
 * 		try{
 * 			被检测的代码
 * 			可能出现异常的代码
 * 		}catch( 异常类名  变量名){
 * 			异常的处理方式
 * 			
 * 		}finally{
 * 			必须要执行的代码
 * 		}
 * 
 *
 */

public class ExceptionDemo02 {
	public static void main(String[] args) {
		int[] arr = {};
		/*
		 * 处理异常
		 */
		try {
			int i = getArray(arr);
			System.out.println(i);
		} catch(NullPointerException e) {
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			// 对异常信息的详细描述 创建抛出异常构造器的信息打印出来  -> 出现了异常
			System.out.println(e.getMessage());
			// 对异常信息的剪短描述 ->java.lang.Exception: 出现了异常 -> 默认
			System.out.println(e.toString());
			// 对异常信息追踪到标准的错误流 有报错的具体位置
			e.printStackTrace();
		} finally {
			System.out.println("处理完成");
		}
	}
	
	public static int getArray(int[] arr) {
		if (arr == null) {
			// 手动抛出
			throw new NullPointerException("数组不存在(空指针异常)");
		}
		if (arr.length < 4) {
			throw new ArrayIndexOutOfBoundsException("数组中没有4索引(数组越界异常)");
		}
		return arr[4] + 1;
	}
}
