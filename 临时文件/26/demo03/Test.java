package com.itstar.demo03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件的方式：
 * 	运行类名和方法名，以键值对的形式存储在文件中
 *  运行那个累，读取这个配置文件就可以了
 *  
 * 实现步骤：
 * 	1.准备配置文件 键值对
 *  2.IO流读取配置文件 Reader
 *  3.文件中键值对存储集合中 Properties
 *    集合保存的键值对  类名->方法名
 *  4.反射获取指定的class文件对象
 *  5.class文件对象，获取方法
 *  6.运行方法
 */
public class Test {
	public static void main(String[] args) throws Exception {
		//io流读取配置文件
		FileReader r = new FileReader("config.properties");
		
		//存储集合中 键值对
		// String getProperty(String key) 
		Properties pro = new Properties();
		//加载配置文件
		pro.load(r);
		//关闭流
		
		String classname = pro.getProperty("className");
		String methodname = pro.getProperty("methodName");
		
		//拿到class文件对象
		Class c = Class.forName(classname);
		
		//获取指定的方法名
		Object obj = c.newInstance();
		Method method = c.getMethod(methodname);
		method.invoke(obj);
	}
}
