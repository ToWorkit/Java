1：常用API->String类的练习、

2：常用API->StringBuffer类 特点可变字符数组

	在我们学习String类的时候，API说了字符串缓冲区支持可变的字符。但是String类一旦定义好了
	就不能变了，就会浪费内存。
	jdk为了解决字符串浪费内存的问题，开发出了一个新类（字符串缓冲区）。目的，提高字符串的
	操作效率而诞生。
	
	StringBuffer可变长度的字符序列，也就是可变长度的数组。在String类中，出现一个双引号的
	号就是一个数组。StringBuffer出现了双引号,可扩容（可变），存储过后原来的数组被干掉。
	StringBuffer源码中，可变长度。
	
3：常用API->正则表达式概念和作用

	正则表达式(英语中：Regular Expression在代码中简写regex)
	正则表达式是一个字符串。使用单个字符串来描述它。用来定义匹配规则的，匹配符合某个句
	法规则的字符串。在开发中，正则表达式来用检索，替换那些符合某个规则的文本。
	
	作用：对字符串的匹配高度的复杂处理！

4：常用API->正则表达式的语法规则

	字符：x
	含义：代表的是字符x
	例子：匹配规则为"a",那么匹配的字符串的内容就是"a"