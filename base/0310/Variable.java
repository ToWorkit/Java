public class Variable {
	/*
		四类八种, 看笔记
	*/
	public static void main(String[] args) {
		// 定义整数类型 -> 超过各自的精度会报有损失的编译错误，精度在笔记上 129
		byte b = 127;
		System.out.println(b);
		// 短整型
		short s = 32767;
		System.out.println(s);
		// 默认的整数型
		int i = 20001002;
		System.out.println(i);
		// Long整型 -> 后面需要跟 L
		long l = 2147483649L;
		System.out.println(l);
		
		// 浮点型 -> 默认是double，所以后面要跟 F
		float f = 1.0F;
		System.out.println(f);
		// 浮点型，双精度, 后面加 F，表示要转为float类型 2.2F
		double d = 2.2;
		System.out.println(d);
		
		// 字符，只能有一个
		char c = '嗯';
		System.out.println(c);
		// 字符串，可以为多个, 不是java的类型 
		String s_ = "嗯嗯";
		System.out.println(s_);
		
		// 布尔类型
		boolean bl = true;
		System.out.println(bl);
		
		System.out.println(true & false);
	}
}