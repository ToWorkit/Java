1：IO流对象->IO流操作规律

	明确一：要操作的是数据源还是数据目的
		源：InputStream Reader
		目的：OutputStream Writer 4个基类
		
		先明确需求？读还是写
		
	明确二：要操作的数据是文本数据还是字节数据
	
		源：
			字节：InputStream
			文本：Reader
			
		目的：
			字节：OutputStream
			文本：Writer
			
		已经明确到了具体的体系当中，用谁的子类来搞定。
		
	明确三：明确设备所在的具体设备
	
		源设备：
			硬盘：文件 File开头
			内存：数组 字符串
			键盘：System.in
			
		目的设备：
			硬盘：文件 File开头
			内存：数组 字符串
			屏幕：System.out
			
		完全可以确定到底使用哪个流对象
		
	明确四：是否需要额外的功能
	
		转换吗？
		高效吗？
		
	所有流对象：
		InputStream	字节流
			FileInputStream	字节流 专门读写非文本文件的
			BufferedInputStream 高效流
		
		
		OutputStream 字节流
			FileOutputStream 字节流 专门读写非文本文件的
			BufferedOutputStream 高效流
			
		Writer	文本输出流
			OutputStreamWriter 转换流 ，改变编码
				FileWriter 子类 默认编码表 读取文本的
			BufferedWriter 高效流
		
		Reader	文本输入流
			InputStreamReader 转换流 ，改变编码
				FileReader 子类 默认编码表 读取文本的
			BufferedReader 高效流
			
2：多线程->进程与线程的概念

	进程指正在运行的程序。内存中的每个程序称为进程。处于运行过程中的程序，具有一定的
	独立功能。
	
	单线程程序：就一个线程
	
	多线程程序：一个程序当中有多个线程同时运行
	
3：多线程->运行原理

	分时调度：
	
	抢占式调度：java
	
	java.lang -> 包特点，不需要导入就可以直接用
	接口创建线程的方式更好 -> 多实现