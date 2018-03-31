package demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件的方式：
 * 	运行类名和方法名，以键值对的形式存储在文件中
 *  运行那个类，读取相对应的配置文件就可以了
 *  
 * 实现步骤：
 * 	1.准备配置文件 -> 键值对
 *  2.IO流读取配置文件 -> Reader
 *  3.文件中键值对存储集合中 Properties
 *    	集合保存的键值对  类名->方法名
 *  4.反射获取指定的class文件对象
 *  5.class文件对象，获取方法
 *  6.运行方法
 */

public class Test {
	public static void main(String[] args) throws Exception {
		// 读取配置文件
		FileReader r = new FileReader("config.properties");
		
		// 存储配置文件中的键值对
		Properties pro = new Properties();
		// 加载配置文件
		pro.load(r);
		
		// 获取键值
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		// 根据配置文件中的className获取对应的 .class 文件
		Class c = Class.forName(className);
		Object obj = c.newInstance();
/*		Student s = (Student)obj;
		s.study();*/
		// 根据配置文件中的methodName获取对应的 方法
		Method method = c.getMethod(methodName);
//		Object obj = c.newInstance();
		method.invoke(c.newInstance());
	}
}
