package demo03;

public class String_05 {
	public static void main(String[] args) {
		// 非静态方法调用
		String_05 s = new String_05();
		s.fun_01();
		
		fun();
	}
	
	/**
	 * byte[] getBytes()
	 * 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
	 * 将字符串转换为字符数组 
	 */
	// 静态化之后会存于缓存区，可以使用.调用
	public static void fun() {
		String s = "test";
		byte[] bytes = s.getBytes();
		for(int i: bytes) {
			System.err.println(i);
		}
	}
	
	/**
	 * int indexOf(int ch)
	 * 返回指定字符在此字符串中第一次出现处的索引
	 */
	// 非静态方法，要实例化之后才可以调用
	public void fun_01() {
		String s = "test";
		int index = s.indexOf("s");
		System.out.println(index);
	}
	
}
