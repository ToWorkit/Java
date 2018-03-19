1：IO流对象->IO技术概述

	之前的数组还是集合，数据都在内存中。一旦程序运行结束，这些数据都没有了。
	怎么办呢？能不能把运行完的数据都保存下来呢？下次程序启动的时候就可以继续使用了。
	数据进行了持久化保存，把数据存储在内存以外的其它持久化设备中（硬盘、光盘、U盘）
	
2：IO流对象->File类的概述及作用

	表现形式3种：文件夹（存储文件的容器） 文件 路径
	
	平台无关性。windows系统、linux操作系统。windows"\" linux"/"
	
3：IO流对象->相对路径和绝对路径

	路径：
			绝对路径：在系统中具有唯一性
				C:\Windows\System32
				
			相对路径：表示的是路径之间的相互关系
				C:\Program Files\Java\jdk1.8.0_131\\bin
				C:\Program Files\Java\jre1.8.0_131
				
			路径之间的关系：
			 java 父目录：C:\Program Files
			 Java 子目录：jdk1.8.0_131 jre1.8.0_131
			 
			 父目录具有唯一性
			 子目录可以多个
			 
			 c:\\abc
			 c:\\abc\\bb
			 c:\\abc\\bb.java  更好
			 
4：IO流对象->file类的获取功能

5：IO流对象->file类的判断功能

6：IO流对象->文件过滤器

	FileFilter
	
7：IO流对象->输入与输出
	
	文件到程序，输入
	程序到文件，输出
	
8：IO流对象->字节输出流OutputStream

	字节是文件存储的最小单元。特点：文件当中值操作一个字节。目的是写文件。
	抽象类。
	
9：IO流对象->字节输入流InputStream

	java.io.InputStream

	作用：读取任意文件，每次只读取一个字节
	
	读取方法：
	
		int read() 读取的是一个字节
		int read(byte[] b) 读取一定量的字节
