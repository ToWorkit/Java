package demo01;

public class DataType01 {
	public static void main(String[] args) {
		// 整数类型
		byte b = 10; // 占 一 个字节 -128 ~ 127
		int i = 10; // 占 两 个字节 -32768 ~ 32767，默认
		short s = 10; // 占 两 个字节 -2147483648 ~ 2147483648
		long l = 999999999999L; // 占 八 个字节 -9223372036854775808 ~ 9223372036854775807
		
		// 浮点型
		float f = 12.3F; // 占 四 个字节
		double d = 33.4; // 占 八 个字节 默认
		
		// 字符类型 占 两 个字节
		char c = 'a'; 
		
		// 布尔类型  占 两 个字节
		boolean b1 = true;
		boolean b2 = false;
		
	}
}
