package com.itstar.demo03;
/*
 * 类C，同时实现两个接口 接口A B
 * 作为实现类，C，全部重写两个接口的所有抽象方法，才能创建C的对象
 * 
 */
public class C extends D implements A,B{

	@Override
	public void a() {
	}

	@Override
	public void d() {
	}

}
