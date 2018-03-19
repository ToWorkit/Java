1：IO流对象->文件复制

	通过字节的方式对流进行复制。IO可以进行上传和下载。
	
	
2：IO流对象->字符输入流FileReader  程序为参照  磁盘-》程序

	读文本
	
3：IO流对象->字符输出流FileWriter 程序-》磁盘

	写文本
	
4：IO流对象->转换流概述

	FileReader与FileWriter->假定默认的字节缓冲区大小都是适当的
	如何指定编码？
	
	转换流——》字符转字节
	GBK 两个字节
	UTF-8 三个字节（更规范）
	
	FileWriter用的GBK，如果想用UTF-8怎么办？
	加转换流 目的-》转换编码表
	
	OutputStreamWriter    字符流向字节
	
5：IO流对象->缓冲流

	提高程序的执行效率
	
	根据流的方向，两个：
		写入数据到流中，字节缓冲输出流，BufferedOutputStream
		写入数据到流中，字节缓冲输入流，BufferedInputStream