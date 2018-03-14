1：常用API->API概念

	java中的API(Application->应用  Programming->程序  Interface->接口)
	java中的API就是JDK给我们提供的一些可使用的类，这些类将底层的代码实现
	封装了起来。
	我们不需要关心这些类如何实现的，如何实现在JDK的src当中。
	
2：常用的API->Object类

	所有类的父类。存在java.lang包当中，这个包不需要import。java中的最底层的父类，
	它没有父类。所有类都是它的子类。它的方法，所有子类都具有。它的方法很重要。
	
3：常用API->Object类的equals方法 toString

	指定其它某个对象是否与这个对象相等
	
4：常用API->String类的概念和不变性

	字符串是常量，不可以更改。
	String str = "abc";
	private final char value[];